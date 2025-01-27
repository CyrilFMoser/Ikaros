package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D() extends T_B[Int, CC_A]
case class CC_E(a: T_A, b: T_B[(CC_B,CC_D), (T_A,CC_A)], c: CC_B) extends T_B[Int, CC_A]
case class CC_F(a: CC_D, b: CC_B, c: Byte) extends T_B[Int, CC_A]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(), _, _) => 1 
  case CC_E(CC_B(CC_A(), CC_A()), _, _) => 2 
  case CC_E(CC_B(CC_A(), CC_B(_, _)), _, _) => 3 
  case CC_E(CC_B(CC_A(), CC_C(_)), _, _) => 4 
  case CC_E(CC_B(CC_B(_, _), CC_B(_, _)), _, _) => 5 
  case CC_E(CC_B(CC_B(_, _), CC_C(_)), _, _) => 6 
  case CC_E(CC_B(CC_C(_), CC_A()), _, _) => 7 
  case CC_E(CC_B(CC_C(_), CC_B(_, _)), _, _) => 8 
  case CC_E(CC_B(CC_C(_), CC_C(_)), _, _) => 9 
  case CC_E(CC_C(CC_A()), _, _) => 10 
  case CC_E(CC_C(CC_B(_, _)), _, _) => 11 
  case CC_E(CC_C(CC_C(_)), _, _) => 12 
  case CC_F(_, CC_B(CC_A(), _), _) => 13 
  case CC_F(_, CC_B(CC_B(_, _), _), _) => 14 
  case CC_F(_, CC_B(CC_C(_), _), _) => 15 
}
}
// This is not matched: CC_E(CC_B(CC_B(_, _), CC_A()), _, _)