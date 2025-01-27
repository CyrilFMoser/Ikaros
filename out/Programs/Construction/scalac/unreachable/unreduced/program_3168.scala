package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],T_A[Boolean]), b: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B(a: CC_A, b: T_A[T_A[Int]]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A((_,_), CC_A(_, _))) => 0 
  case CC_A(_, CC_A((_,_), CC_B(_, _))) => 1 
  case CC_A(_, CC_B(CC_A(_, _), _)) => 2 
  case CC_B(CC_A((_,_), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 3 
  case CC_B(CC_A((_,_), CC_A(_, _)), CC_A(_, CC_B(_, _))) => 4 
  case CC_B(CC_A((_,_), CC_A(_, _)), CC_B(_, _)) => 5 
  case CC_B(CC_A((_,_), CC_B(_, _)), CC_A(_, CC_A(_, _))) => 6 
  case CC_B(CC_A((_,_), CC_B(_, _)), CC_A(_, CC_B(_, _))) => 7 
  case CC_B(CC_A((_,_), CC_B(_, _)), CC_B(_, _)) => 8 
}
}