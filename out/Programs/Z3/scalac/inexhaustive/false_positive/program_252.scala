package Program_31 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D, E](a: CC_A[D], b: T_A[D]) extends T_A[D]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
  case CC_B(_, CC_B(_, _)) => 1 
  case CC_A() => 2 
}
}
// This is not matched: (CC_B Int Boolean Wildcard Wildcard (T_A Int))
// This is not matched: (CC_D Wildcard (T_B Int))