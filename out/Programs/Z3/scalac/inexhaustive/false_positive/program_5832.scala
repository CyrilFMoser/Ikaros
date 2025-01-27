package Program_15 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[D, C, E]() extends T_B[D, C]
case class CC_C[F]() extends T_B[F, Boolean]
case class CC_D[G](a: T_B[CC_A, G], b: CC_B[G, T_A, G]) extends T_B[G, Boolean]

val v_a: T_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_D(CC_B(), CC_B()) => 2 
}
}
// This is not matched: (CC_D Char
//      (CC_B (CC_A T_A) Char T_A (T_B (CC_A T_A) Char))
//      (CC_B Char T_A Char (T_B Char T_A))
//      (T_B Char Boolean))
// This is not matched: (CC_C Char (T_B Char Boolean))