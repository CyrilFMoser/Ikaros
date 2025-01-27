package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: T_B[C, C], b: Byte) extends T_B[C, CC_A]

val v_a: T_B[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
}
}
// This is not matched: Pattern match is empty without constants