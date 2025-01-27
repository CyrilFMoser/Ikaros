package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_D(a: T_B[Char, (Byte,Int)], b: T_A) extends T_B[CC_B, T_A]

val v_a: T_B[CC_B, T_A] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A()) => 0 
}
}
// This is not matched: Pattern match is empty without constants