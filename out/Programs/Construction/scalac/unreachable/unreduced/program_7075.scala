package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_A], b: T_B[T_A, T_A]) extends T_A
case class CC_B(a: T_B[T_A, T_A]) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: T_B[T_A, C], b: C, c: T_A) extends T_B[T_A, C]
case class CC_E() extends T_B[T_A, CC_A]
case class CC_F(a: ((T_A,CC_B),T_B[T_A, CC_A])) extends T_B[T_A, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(CC_D(_, _, _), CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(_, CC_D(CC_D(_, _, _), CC_C(_), CC_A(_, _))) => 1 
  case CC_A(_, CC_D(CC_D(_, _, _), CC_A(_, _), CC_B(_))) => 2 
  case CC_A(_, CC_D(CC_D(_, _, _), CC_B(_), CC_B(_))) => 3 
  case CC_A(_, CC_D(CC_D(_, _, _), CC_C(_), CC_B(_))) => 4 
  case CC_A(_, CC_D(CC_D(_, _, _), CC_A(_, _), CC_C(_))) => 5 
  case CC_A(_, CC_D(CC_D(_, _, _), CC_B(_), CC_C(_))) => 6 
  case CC_A(_, CC_D(CC_D(_, _, _), CC_C(_), CC_C(_))) => 7 
  case CC_B(CC_D(_, _, _)) => 8 
  case CC_C(CC_A(_, _)) => 9 
  case CC_C(CC_B(CC_D(_, _, _))) => 10 
  case CC_C(CC_C(_)) => 11 
}
}
// This is not matched: CC_A(_, CC_D(CC_D(_, _, _), CC_B(_), CC_A(_, _)))