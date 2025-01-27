package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F](a: E) extends T_A[F, E]

val v_a: CC_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants