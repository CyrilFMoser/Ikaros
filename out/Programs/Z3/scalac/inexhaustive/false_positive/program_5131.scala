package Program_13 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[D, C, E]() extends T_B[C, D]
case class CC_D[F](a: CC_B, b: (CC_B,T_A), c: T_B[F, Boolean]) extends T_B[F, Boolean]

val v_a: T_B[CC_B, Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C Int (CC_B (T_B T_A T_A)) T_A (T_B (CC_B (T_B T_A T_A)) Int))
// This is not matched: Pattern match is empty without constants