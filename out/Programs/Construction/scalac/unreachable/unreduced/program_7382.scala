package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Char, T_A]) extends T_A
case class CC_B(a: T_B[T_B[T_A, T_A], CC_A], b: Boolean) extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A
case class CC_D[C](a: Int, b: T_A, c: C) extends T_B[C, CC_A]
case class CC_E[D](a: CC_B) extends T_B[CC_D[D], D]
case class CC_F[E](a: T_B[E, CC_A], b: T_B[CC_D[E], E], c: (T_B[T_A, CC_A],Byte)) extends T_B[E, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_D(_, CC_A(_, _), _), _) => 1 
  case CC_B(CC_D(_, CC_B(_, _), _), _) => 2 
  case CC_B(CC_D(_, CC_C(_, _), _), _) => 3 
  case CC_B(CC_F(_, _, _), _) => 4 
  case CC_C(CC_A(CC_A(_, _), _), _) => 5 
  case CC_C(CC_A(CC_B(_, _), _), _) => 6 
  case CC_C(CC_A(CC_C(_, _), _), _) => 7 
  case CC_C(CC_B(CC_F(_, _, _), _), _) => 8 
  case CC_C(CC_C(_, _), _) => 9 
}
}
// This is not matched: CC_C(CC_B(CC_D(_, _, _), _), _)