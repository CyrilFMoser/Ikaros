package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, E]]
case class CC_B[F](a: (Char,Byte)) extends T_B[CC_A[Char], F]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((_,0)) => 0 
}
}
// This is not matched: Pattern match is empty without constants