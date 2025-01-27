package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F](a: Int) extends T_A[E, F]

val v_a: CC_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants