package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: Char) extends T_B[(Byte,(Char,Char)), CC_A[Byte]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants