package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char) extends T_A
case class CC_B(a: T_B[Byte, CC_A], b: T_A) extends T_A
case class CC_C(a: Boolean, b: T_A, c: CC_A) extends T_A
case class CC_D[C](a: CC_A) extends T_B[(CC_C,(CC_A,CC_B)), C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, CC_C(_, _, _)) => 3 
  case CC_C(_, _, _) => 4 
}
}