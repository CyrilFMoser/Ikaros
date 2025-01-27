package Program_31 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_B], c: Char) extends T_A[T_B]
case class CC_B[B]() extends T_A[B]
case class CC_C(a: T_A[T_B], b: (Boolean,Boolean)) extends T_A[T_B]
case class CC_D[C]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}
// This is not matched: (CC_D T_B T_B)
// This is not matched: (CC_D (T_B (T_B (CC_B T_A T_A T_A T_A))))