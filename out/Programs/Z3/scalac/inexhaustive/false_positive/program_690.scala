package Program_31 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B]) extends T_A[B]
case class CC_B[D]() extends T_A[D]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(CC_B()) => 1 
  case CC_B() => 2 
}
}
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int))
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)