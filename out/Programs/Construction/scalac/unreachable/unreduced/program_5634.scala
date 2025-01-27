package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B(a: (CC_A,CC_A), b: T_A[T_A[Int]], c: T_A[(Boolean,Boolean)]) extends T_A[T_A[Int]]
case class CC_C(a: T_A[T_A[Char]], b: T_A[T_A[Int]]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B((_,_), CC_A(_), _)) => 3 
  case CC_A(CC_B((_,_), CC_B(_, _, _), _)) => 4 
  case CC_A(CC_B((_,_), CC_C(_, _), _)) => 5 
  case CC_A(CC_C(_, CC_A(_))) => 6 
  case CC_A(CC_C(_, CC_B(_, _, _))) => 7 
  case CC_A(CC_C(_, CC_C(_, _))) => 8 
  case CC_B((CC_A(_),CC_A(_)), CC_A(_), _) => 9 
  case CC_B((CC_A(_),CC_A(_)), CC_B(_, _, _), _) => 10 
  case CC_B((CC_A(_),CC_A(_)), CC_C(_, CC_A(_)), _) => 11 
  case CC_B((CC_A(_),CC_A(_)), CC_C(_, CC_B(_, _, _)), _) => 12 
  case CC_B((CC_A(_),CC_A(_)), CC_C(_, CC_C(_, _)), _) => 13 
  case CC_C(_, CC_A(CC_A(_))) => 14 
  case CC_C(_, CC_A(CC_B(_, _, _))) => 15 
  case CC_C(_, CC_A(CC_C(_, _))) => 16 
  case CC_C(_, CC_B(_, _, _)) => 17 
  case CC_C(_, CC_C(_, CC_A(_))) => 18 
  case CC_C(_, CC_C(_, CC_B(_, _, _))) => 19 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 20 
}
}