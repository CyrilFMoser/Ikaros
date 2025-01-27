package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_B() extends T_A
case class CC_C[C](a: Int, b: T_B[C, C], c: T_B[C, Char]) extends T_B[C, Char]
case class CC_D[D]() extends T_B[D, Char]

val v_a: CC_C[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_D()) => 0 
}
}
// This is not matched: Pattern match is empty without constants