package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B[C](a: Boolean) extends T_A[C]
case class CC_C[D](a: T_B[D], b: D) extends T_A[D]
case class CC_D(a: T_A[T_A[Char]], b: (T_B[CC_A],(CC_A,CC_A))) extends T_B[CC_A]
case class CC_E(a: T_A[T_B[Byte]], b: T_A[T_A[Char]], c: T_A[CC_B[CC_A]]) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_B(_), CC_A(CC_A(_)), CC_B(_)) => 1 
  case CC_E(CC_C(_, _), CC_A(CC_A(_)), CC_B(_)) => 2 
  case CC_E(CC_B(_), CC_A(CC_B(_)), CC_B(_)) => 3 
  case CC_E(CC_C(_, _), CC_A(CC_B(_)), CC_B(_)) => 4 
  case CC_E(CC_B(_), CC_A(CC_C(_, _)), CC_B(_)) => 5 
  case CC_E(CC_B(_), CC_B(_), CC_B(_)) => 6 
  case CC_E(CC_C(_, _), CC_B(_), CC_B(_)) => 7 
  case CC_E(CC_B(_), CC_C(_, _), CC_B(_)) => 8 
  case CC_E(CC_C(_, _), CC_C(_, _), CC_B(_)) => 9 
  case CC_E(CC_B(_), CC_A(CC_A(_)), CC_C(_, CC_B(_))) => 10 
  case CC_E(CC_C(_, _), CC_A(CC_A(_)), CC_C(_, CC_B(_))) => 11 
  case CC_E(CC_B(_), CC_A(CC_B(_)), CC_C(_, CC_B(_))) => 12 
  case CC_E(CC_C(_, _), CC_A(CC_B(_)), CC_C(_, CC_B(_))) => 13 
  case CC_E(CC_B(_), CC_A(CC_C(_, _)), CC_C(_, CC_B(_))) => 14 
  case CC_E(CC_C(_, _), CC_A(CC_C(_, _)), CC_C(_, CC_B(_))) => 15 
  case CC_E(CC_B(_), CC_B(_), CC_C(_, CC_B(_))) => 16 
  case CC_E(CC_C(_, _), CC_B(_), CC_C(_, CC_B(_))) => 17 
  case CC_E(CC_B(_), CC_C(_, _), CC_C(_, CC_B(_))) => 18 
  case CC_E(CC_C(_, _), CC_C(_, _), CC_C(_, CC_B(_))) => 19 
}
}
// This is not matched: CC_E(CC_C(_, _), CC_A(CC_C(_, _)), CC_B(_))