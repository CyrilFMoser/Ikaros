package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Char, C]
case class CC_B[D](a: Char) extends T_A[D, CC_A[Byte]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants