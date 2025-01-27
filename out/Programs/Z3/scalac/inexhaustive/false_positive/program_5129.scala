package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[F, E](a: E) extends T_A[F, E]
case class CC_B() extends T_A[CC_A[Char, Byte], T_B]

val v_a: CC_A[CC_B, T_A[CC_A[Char, Byte], T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants