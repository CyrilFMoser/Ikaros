package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char]) extends T_A[Char]
case class CC_B[C]() extends T_A[C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_C Boolean Wildcard (T_A (T_A Int)))