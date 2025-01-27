package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), Byte], b: T_A, c: T_A) extends T_A
case class CC_B(a: T_B[Char, CC_A], b: CC_A) extends T_A
case class CC_C(a: Byte) extends T_B[CC_B, T_A]
case class CC_D(a: Boolean, b: CC_B, c: T_A) extends T_B[CC_B, T_A]

val v_a: T_B[CC_B, T_A] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, CC_B(_, _), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 1 
  case CC_D(_, CC_B(_, _), CC_A(_, CC_A(_, _, _), CC_B(_, _))) => 2 
  case CC_D(_, CC_B(_, _), CC_A(_, CC_B(_, _), CC_A(_, _, _))) => 3 
  case CC_D(_, CC_B(_, _), CC_A(_, CC_B(_, _), CC_B(_, _))) => 4 
  case CC_D(_, CC_B(_, _), CC_B(_, CC_A(_, _, _))) => 5 
}
}