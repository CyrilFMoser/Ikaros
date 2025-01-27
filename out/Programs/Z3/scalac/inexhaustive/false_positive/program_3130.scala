package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, E](a: Char) extends T_A[E, F]

val v_a: CC_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants