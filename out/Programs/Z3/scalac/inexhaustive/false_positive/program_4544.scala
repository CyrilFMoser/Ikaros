package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F](a: E) extends T_A[E, F]

val v_a: CC_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants