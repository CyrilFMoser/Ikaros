package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Byte], b: (T_A[Byte],T_B)) extends T_A[Byte]
case class CC_B(a: T_A[Byte], b: T_B) extends T_A[Byte]
case class CC_C(a: CC_A) extends T_A[Byte]
case class CC_D(a: CC_B, b: CC_C, c: CC_A) extends T_B
case class CC_E(a: CC_B, b: T_A[CC_C]) extends T_B
case class CC_F(a: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B(CC_A(_, _), CC_D(_, _, _)), CC_C(_), _) => 0 
  case CC_D(CC_B(CC_B(_, _), CC_D(_, _, _)), CC_C(_), _) => 1 
  case CC_D(CC_B(CC_C(_), CC_D(_, _, _)), CC_C(_), _) => 2 
  case CC_D(CC_B(CC_A(_, _), CC_E(_, _)), CC_C(_), _) => 3 
  case CC_D(CC_B(CC_B(_, _), CC_E(_, _)), CC_C(_), _) => 4 
  case CC_D(CC_B(CC_C(_), CC_E(_, _)), CC_C(_), _) => 5 
  case CC_D(CC_B(CC_A(_, _), CC_F(_)), CC_C(_), _) => 6 
  case CC_D(CC_B(CC_B(_, _), CC_F(_)), CC_C(_), _) => 7 
  case CC_D(CC_B(CC_C(_), CC_F(_)), CC_C(_), _) => 8 
  case CC_E(CC_B(CC_A(_, _), CC_D(_, _, _)), _) => 9 
  case CC_E(CC_B(CC_B(_, _), CC_D(_, _, _)), _) => 10 
  case CC_E(CC_B(CC_A(_, _), CC_E(_, _)), _) => 11 
  case CC_E(CC_B(CC_B(_, _), CC_E(_, _)), _) => 12 
  case CC_E(CC_B(CC_C(_), CC_E(_, _)), _) => 13 
  case CC_E(CC_B(CC_A(_, _), CC_F(_)), _) => 14 
  case CC_E(CC_B(CC_B(_, _), CC_F(_)), _) => 15 
  case CC_E(CC_B(CC_C(_), CC_F(_)), _) => 16 
  case CC_F(_) => 17 
}
}
// This is not matched: CC_E(CC_B(CC_C(_), CC_D(_, _, _)), _)