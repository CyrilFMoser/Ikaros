package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(Byte,Char)], b: T_A[Int], c: T_A[(Byte,Char)]) extends T_A[(Byte,Char)]
case class CC_B(a: T_B, b: Int, c: CC_A) extends T_A[(Byte,Char)]
case class CC_C(a: (T_A[CC_A],Boolean), b: Byte, c: T_B) extends T_A[(Byte,Char)]
case class CC_D(a: T_A[Boolean], b: T_B) extends T_B
case class CC_E(a: CC_D, b: Char) extends T_B
case class CC_F(a: Byte, b: Int, c: (T_A[(Int,Boolean)],CC_E)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(_, CC_D(_, _))) => 0 
  case CC_D(_, CC_D(_, CC_E(_, _))) => 1 
  case CC_D(_, CC_D(_, CC_F(_, _, _))) => 2 
  case CC_D(_, CC_E(_, 'x')) => 3 
  case CC_D(_, CC_E(_, _)) => 4 
  case CC_D(_, CC_F(_, _, _)) => 5 
  case CC_E(_, _) => 6 
  case CC_F(_, _, (_,CC_E(_, _))) => 7 
}
}