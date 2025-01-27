package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Boolean, Boolean], Byte]
case class CC_C[E, F](a: Char) extends T_A[E, F]

val v_a: CC_C[CC_A, Int] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants