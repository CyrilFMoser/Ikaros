package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F](a: Char) extends T_A[E, F]

val v_a: CC_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants