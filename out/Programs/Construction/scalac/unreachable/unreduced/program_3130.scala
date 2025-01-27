package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[Int, Byte]) extends T_A
case class CC_C[C](a: C) extends T_B[Boolean, C]
case class CC_D(a: CC_C[(Byte,CC_A)]) extends T_B[Boolean, T_A]
case class CC_E() extends T_B[Boolean, T_B[((Int,Byte),CC_D), CC_D]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _), _)) => 0 
  case CC_A(_, CC_A(CC_B(_, _), _)) => 1 
  case CC_A(_, CC_B(CC_A(_, _), _)) => 2 
  case CC_B(CC_A(_, _), _) => 3 
}
}