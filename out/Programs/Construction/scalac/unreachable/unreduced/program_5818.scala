package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Boolean, T_B[Int, T_A]], b: T_A, c: T_B[T_B[T_A, T_A], Int]) extends T_A
case class CC_B(a: T_A, b: Boolean) extends T_A
case class CC_C(a: CC_B, b: Byte, c: T_B[T_B[T_A, CC_B], CC_B]) extends T_A
case class CC_D[C](a: (CC_B,T_A), b: Boolean, c: T_B[C, C]) extends T_B[T_B[T_A, T_A], C]
case class CC_E[D]() extends T_B[T_B[T_A, T_A], D]
case class CC_F[E](a: CC_C, b: CC_B, c: T_B[T_B[T_A, T_A], E]) extends T_B[T_B[T_A, T_A], E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_B(CC_B(CC_A(_, _, _), true), _) => 2 
  case CC_B(CC_B(CC_A(_, _, _), false), _) => 3 
  case CC_B(CC_B(CC_B(_, _), true), _) => 4 
  case CC_B(CC_B(CC_B(_, _), false), _) => 5 
  case CC_B(CC_B(CC_C(_, _, _), true), _) => 6 
  case CC_B(CC_B(CC_C(_, _, _), false), _) => 7 
  case CC_B(CC_C(_, _, _), _) => 8 
  case CC_C(CC_B(CC_A(_, _, _), _), _, _) => 9 
  case CC_C(CC_B(CC_B(_, _), _), _, _) => 10 
  case CC_C(CC_B(CC_C(_, _, _), _), _, _) => 11 
}
}