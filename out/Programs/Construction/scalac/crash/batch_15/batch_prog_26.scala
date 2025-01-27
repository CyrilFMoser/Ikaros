package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Byte, Char]], b: T_A[T_A[Char]], c: T_A[T_B[Int, Int]]) extends T_A[T_A[Char]]
case class CC_B(a: T_A[T_A[Char]], b: Char, c: (CC_A,T_B[CC_A, CC_A])) extends T_A[T_A[Char]]
case class CC_C(a: T_B[T_B[CC_A, CC_B], T_A[CC_B]], b: T_A[T_A[Char]], c: CC_B) extends T_A[T_A[Char]]
case class CC_D[D]() extends T_B[D, T_B[D, D]]
case class CC_E[E](a: E, b: E, c: CC_B) extends T_B[E, T_B[E, E]]

val v_a: T_B[CC_C, T_B[CC_C, CC_C]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_C(_, CC_A(_, _, _), CC_B(_, _, _)), CC_C(_, CC_A(_, _, _), _), _) => 1 
  case CC_E(CC_C(_, CC_B(_, _, _), CC_B(_, _, _)), CC_C(_, CC_A(_, _, _), _), _) => 2 
  case CC_E(CC_C(_, CC_C(_, _, _), CC_B(_, _, _)), CC_C(_, CC_A(_, _, _), _), _) => 3 
  case CC_E(CC_C(_, CC_A(_, _, _), CC_B(_, _, _)), CC_C(_, CC_B(_, _, _), _), _) => 4 
  case CC_E(CC_C(_, CC_B(_, _, _), CC_B(_, _, _)), CC_C(_, CC_B(_, _, _), _), _) => 5 
  case CC_E(CC_C(_, CC_C(_, _, _), CC_B(_, _, _)), CC_C(_, CC_B(_, _, _), _), _) => 6 
  case CC_E(CC_C(_, CC_B(_, _, _), CC_B(_, _, _)), CC_C(_, CC_C(_, _, _), _), _) => 7 
  case CC_E(CC_C(_, CC_C(_, _, _), CC_B(_, _, _)), CC_C(_, CC_C(_, _, _), _), _) => 8 
}
}
// This is not matched: CC_E(CC_C(_, CC_A(_, _, _), CC_B(_, _, _)), CC_C(_, CC_C(_, _, _), _), _)