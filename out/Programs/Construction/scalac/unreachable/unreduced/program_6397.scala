package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B(a: T_A[T_A[Char]], b: T_A[T_B], c: T_B) extends T_A[T_A[Char]]
case class CC_C(a: Int) extends T_A[T_A[Char]]
case class CC_D(a: Byte, b: T_A[CC_B]) extends T_B
case class CC_E(a: T_A[T_B], b: CC_B, c: T_A[T_A[Char]]) extends T_B

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _), CC_A(_, CC_A(_, _))) => 0 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 1 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A(_, CC_A(_, _))) => 2 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_C(_)), CC_A(_, CC_A(_, _))) => 3 
  case CC_A(CC_D(_, _), CC_A(_, CC_B(_, _, _))) => 4 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_A(_, _)), CC_A(_, CC_B(_, _, _))) => 5 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A(_, CC_B(_, _, _))) => 6 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_C(_)), CC_A(_, CC_B(_, _, _))) => 7 
  case CC_A(CC_D(_, _), CC_A(_, CC_C(_))) => 8 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_A(_, _)), CC_A(_, CC_C(_))) => 9 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A(_, CC_C(_))) => 10 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_C(_)), CC_A(_, CC_C(_))) => 11 
  case CC_A(CC_D(_, _), CC_B(_, _, _)) => 12 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_A(_, _)), CC_B(_, _, _)) => 13 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, _)) => 14 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_C(_)), CC_B(_, _, _)) => 15 
  case CC_A(CC_D(_, _), CC_C(_)) => 16 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_A(_, _)), CC_C(_)) => 17 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_B(_, _, _)), CC_C(_)) => 18 
  case CC_A(CC_E(_, CC_B(_, _, _), CC_C(_)), CC_C(_)) => 19 
  case CC_B(_, _, CC_D(_, _)) => 20 
  case CC_B(_, _, CC_E(_, CC_B(_, _, _), _)) => 21 
  case CC_C(12) => 22 
  case CC_C(_) => 23 
}
}