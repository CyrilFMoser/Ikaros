package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(Byte,Byte)], b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_E() extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B T_A)