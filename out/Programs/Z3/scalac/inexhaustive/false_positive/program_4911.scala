package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, E]() extends T_A[E, D]
case class CC_B[F](a: (Char,Char)) extends T_A[CC_A[F, F], F]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: Pattern match is empty without constants