package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Char, Byte], C]
case class CC_B(a: Char) extends T_A[T_A[Char, Byte], CC_A[Char]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants