package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[T_A, T_A]], b: T_B[T_A, T_A], c: T_B[T_A, T_B[T_A, Char]]) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: T_A, b: CC_A) extends T_A
case class CC_D[C](a: T_B[C, (CC_C,CC_C)], b: Byte) extends T_B[C, T_A]
case class CC_E(a: T_B[CC_B, Boolean]) extends T_B[Int, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _)) => 2 
  case CC_C(CC_B(CC_A(_, _, _), _), CC_A(_, _, _)) => 3 
  case CC_C(CC_B(CC_B(_, _), _), CC_A(_, _, _)) => 4 
  case CC_C(CC_B(CC_C(_, _), _), CC_A(_, _, _)) => 5 
  case CC_C(CC_C(CC_A(_, _, _), _), CC_A(_, _, _)) => 6 
  case CC_C(CC_C(CC_B(_, _), _), CC_A(_, _, _)) => 7 
  case CC_C(CC_C(CC_C(_, _), _), CC_A(_, _, _)) => 8 
}
}