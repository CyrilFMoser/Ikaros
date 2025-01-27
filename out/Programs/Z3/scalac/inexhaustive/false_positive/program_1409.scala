package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B[B]() extends T_A[T_B]
case class CC_C(a: CC_A, b: T_A[T_B], c: T_A[T_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B T_B (T_A T_B))
// This is not matched: (CC_B T_A)