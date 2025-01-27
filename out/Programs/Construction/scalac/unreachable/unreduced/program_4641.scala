package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[Byte, Byte], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[T_A, CC_B]
case class CC_E(a: CC_D, b: CC_B, c: T_A) extends T_B[T_A, CC_B]
case class CC_F[C](a: CC_E, b: Int, c: Byte) extends T_B[CC_D, C]

val v_a: T_B[T_A, CC_B] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_B(CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 1 
  case CC_E(_, CC_B(CC_A(_, _), CC_A(_, _)), CC_B(_, _)) => 2 
  case CC_E(_, CC_B(CC_A(_, _), CC_A(_, _)), CC_C()) => 3 
  case CC_E(_, CC_B(CC_B(_, _), CC_A(_, _)), CC_B(_, _)) => 4 
  case CC_E(_, CC_B(CC_B(_, _), CC_A(_, _)), CC_C()) => 5 
  case CC_E(_, CC_B(CC_C(), CC_A(_, _)), CC_A(_, _)) => 6 
  case CC_E(_, CC_B(CC_C(), CC_A(_, _)), CC_B(_, _)) => 7 
  case CC_E(_, CC_B(CC_C(), CC_A(_, _)), CC_C()) => 8 
  case CC_E(_, CC_B(CC_A(_, _), CC_B(_, _)), CC_A(_, _)) => 9 
  case CC_E(_, CC_B(CC_A(_, _), CC_B(_, _)), CC_B(_, _)) => 10 
  case CC_E(_, CC_B(CC_A(_, _), CC_B(_, _)), CC_C()) => 11 
  case CC_E(_, CC_B(CC_B(_, _), CC_B(_, _)), CC_A(_, _)) => 12 
  case CC_E(_, CC_B(CC_B(_, _), CC_B(_, _)), CC_B(_, _)) => 13 
  case CC_E(_, CC_B(CC_B(_, _), CC_B(_, _)), CC_C()) => 14 
  case CC_E(_, CC_B(CC_C(), CC_B(_, _)), CC_A(_, _)) => 15 
  case CC_E(_, CC_B(CC_C(), CC_B(_, _)), CC_B(_, _)) => 16 
  case CC_E(_, CC_B(CC_C(), CC_B(_, _)), CC_C()) => 17 
  case CC_E(_, CC_B(CC_A(_, _), CC_C()), CC_A(_, _)) => 18 
  case CC_E(_, CC_B(CC_A(_, _), CC_C()), CC_B(_, _)) => 19 
  case CC_E(_, CC_B(CC_A(_, _), CC_C()), CC_C()) => 20 
  case CC_E(_, CC_B(CC_B(_, _), CC_C()), CC_A(_, _)) => 21 
  case CC_E(_, CC_B(CC_B(_, _), CC_C()), CC_B(_, _)) => 22 
  case CC_E(_, CC_B(CC_B(_, _), CC_C()), CC_C()) => 23 
  case CC_E(_, CC_B(CC_C(), CC_C()), CC_A(_, _)) => 24 
  case CC_E(_, CC_B(CC_C(), CC_C()), CC_B(_, _)) => 25 
  case CC_E(_, CC_B(CC_C(), CC_C()), CC_C()) => 26 
}
}
// This is not matched: CC_E(_, CC_B(CC_B(_, _), CC_A(_, _)), CC_A(_, _))