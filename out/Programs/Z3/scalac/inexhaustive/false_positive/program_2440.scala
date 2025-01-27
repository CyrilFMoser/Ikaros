package Program_29 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D, E](a: Int, b: Char) extends T_A[D, C]
case class CC_B() extends T_B
case class CC_C[F]() extends T_B
case class CC_D(a: T_A[T_B, CC_B]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_D (CC_A (CC_B Wildcard) T_B T_B Wildcard Char (T_A T_B (CC_B Wildcard)))
//      T_B)
// This is not matched: Pattern match is empty without constants