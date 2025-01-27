package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: Boolean, b: T_A[T_A[T_B]]) extends T_B
case class CC_D(a: Boolean, b: T_A[(CC_A,CC_C)], c: Char) extends T_B
case class CC_E(a: T_A[T_B], b: T_B, c: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_A(_), CC_C(_, _), _) => 1 
  case CC_E(CC_A(_), CC_D(_, _, _), _) => 2 
  case CC_E(CC_A(_), CC_E(_, _, _), _) => 3 
  case CC_E(CC_B(CC_A(_), CC_A(_)), CC_C(_, _), _) => 4 
  case CC_E(CC_B(CC_A(_), CC_A(_)), CC_D(_, _, _), _) => 5 
  case CC_E(CC_B(CC_A(_), CC_A(_)), CC_E(_, _, _), _) => 6 
  case CC_E(CC_B(CC_B(_, _), CC_A(_)), CC_C(_, _), _) => 7 
  case CC_E(CC_B(CC_B(_, _), CC_A(_)), CC_D(_, _, _), _) => 8 
  case CC_E(CC_B(CC_B(_, _), CC_A(_)), CC_E(_, _, _), _) => 9 
  case CC_E(CC_B(CC_A(_), CC_B(_, _)), CC_C(_, _), _) => 10 
  case CC_E(CC_B(CC_A(_), CC_B(_, _)), CC_D(_, _, _), _) => 11 
  case CC_E(CC_B(CC_A(_), CC_B(_, _)), CC_E(_, _, _), _) => 12 
  case CC_E(CC_B(CC_B(_, _), CC_B(_, _)), CC_C(_, _), _) => 13 
  case CC_E(CC_B(CC_B(_, _), CC_B(_, _)), CC_D(_, _, _), _) => 14 
  case CC_E(CC_B(CC_B(_, _), CC_B(_, _)), CC_E(_, _, _), _) => 15 
}
}
// This is not matched: CC_C(_, _)