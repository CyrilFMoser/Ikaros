package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (Byte,Int), b: T_A[Int], c: T_A[Char]) extends T_A[Char]
case class CC_B(a: (T_A[CC_A],Int), b: T_A[Char]) extends T_A[Char]
case class CC_C(a: T_A[Char]) extends T_B
case class CC_D(a: CC_B, b: T_B) extends T_B
case class CC_E(a: CC_C, b: T_B, c: Byte) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_C(CC_A(_, _, _)), CC_C(CC_A(_, _, _)), _) => 0 
  case CC_E(CC_C(CC_A(_, _, _)), CC_C(CC_B(_, _)), _) => 1 
  case CC_E(CC_C(CC_A(_, _, _)), CC_D(_, _), _) => 2 
  case CC_E(CC_C(CC_A(_, _, _)), CC_E(CC_C(_), CC_D(_, _), _), _) => 3 
  case CC_E(CC_C(CC_A(_, _, _)), CC_E(CC_C(_), CC_E(_, _, _), _), _) => 4 
  case CC_E(CC_C(CC_B(_, _)), CC_C(CC_A(_, _, _)), _) => 5 
  case CC_E(CC_C(CC_B(_, _)), CC_C(CC_B(_, _)), _) => 6 
  case CC_E(CC_C(CC_B(_, _)), CC_D(_, _), _) => 7 
  case CC_E(CC_C(CC_B(_, _)), CC_E(CC_C(_), CC_C(_), _), _) => 8 
  case CC_E(CC_C(CC_B(_, _)), CC_E(CC_C(_), CC_D(_, _), _), _) => 9 
  case CC_E(CC_C(CC_B(_, _)), CC_E(CC_C(_), CC_E(_, _, _), _), _) => 10 
}
}
// This is not matched: CC_E(CC_C(CC_A(_, _, _)), CC_E(CC_C(_), CC_C(_), _), _)