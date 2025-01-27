package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_B[(CC_A,(Int,Byte))], b: Char, c: T_B[CC_A]) extends T_A
case class CC_C(a: CC_B, b: CC_A) extends T_A
case class CC_D() extends T_B[T_A]
case class CC_E(a: T_A, b: CC_C, c: Byte) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(_, CC_A(_, _)), CC_C(CC_B(_, _, _), CC_A(_, _)), _) => 1 
  case CC_E(CC_A(_, CC_B(_, _, _)), CC_C(CC_B(_, _, _), CC_A(_, _)), _) => 2 
  case CC_E(CC_A(_, CC_C(_, _)), CC_C(CC_B(_, _, _), CC_A(_, _)), _) => 3 
  case CC_E(CC_B(_, _, _), CC_C(CC_B(_, _, _), CC_A(_, _)), _) => 4 
  case CC_E(CC_C(CC_B(_, _, _), _), CC_C(CC_B(_, _, _), CC_A(_, _)), _) => 5 
}
}