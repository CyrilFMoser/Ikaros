package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], Byte], b: Boolean, c: T_A) extends T_A
case class CC_B(a: Byte, b: T_A) extends T_A
case class CC_C(a: CC_B, b: T_A) extends T_A
case class CC_D[C]() extends T_B[Boolean, C]
case class CC_E[D]() extends T_B[D, CC_D[D]]
case class CC_F[E](a: Int, b: T_B[Boolean, E]) extends T_B[T_B[CC_E[T_A], CC_D[CC_E[T_A]]], T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_, _))) => 1 
  case CC_A(_, _, CC_A(_, _, CC_C(_, _))) => 2 
  case CC_A(_, _, CC_B(_, CC_A(_, _, _))) => 3 
  case CC_A(_, _, CC_B(_, CC_B(_, _))) => 4 
  case CC_A(_, _, CC_B(_, CC_C(_, _))) => 5 
  case CC_A(_, _, CC_C(_, _)) => 6 
  case CC_B(_, CC_A(_, _, _)) => 7 
  case CC_B(_, CC_B(_, CC_A(_, _, _))) => 8 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 9 
  case CC_B(_, CC_B(_, CC_C(_, _))) => 10 
  case CC_B(_, CC_C(CC_B(_, _), _)) => 11 
  case CC_C(CC_B(_, _), CC_A(_, _, _)) => 12 
  case CC_C(CC_B(_, _), CC_B(0, CC_A(_, _, _))) => 13 
  case CC_C(CC_B(_, _), CC_B(_, CC_A(_, _, _))) => 14 
  case CC_C(CC_B(_, _), CC_B(0, CC_B(_, _))) => 15 
  case CC_C(CC_B(_, _), CC_B(_, CC_B(_, _))) => 16 
  case CC_C(CC_B(_, _), CC_B(0, CC_C(_, _))) => 17 
  case CC_C(CC_B(_, _), CC_B(_, CC_C(_, _))) => 18 
  case CC_C(CC_B(_, _), CC_C(CC_B(_, _), CC_A(_, _, _))) => 19 
  case CC_C(CC_B(_, _), CC_C(CC_B(_, _), CC_B(_, _))) => 20 
  case CC_C(CC_B(_, _), CC_C(CC_B(_, _), CC_C(_, _))) => 21 
}
}