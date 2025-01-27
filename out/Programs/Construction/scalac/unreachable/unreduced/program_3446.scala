package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Char,Int)], b: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_A[Int]], b: (Char,CC_A)) extends T_A[T_A[Int]]
case class CC_C(a: Int, b: T_A[T_A[Int]], c: CC_B) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _))) => 1 
  case CC_A(_, CC_A(_, CC_C(_, _, _))) => 2 
  case CC_A(_, CC_B(_, _)) => 3 
  case CC_A(_, CC_C(_, _, _)) => 4 
  case CC_B(CC_A(_, CC_A(_, _)), (_,CC_A(_, _))) => 5 
  case CC_B(CC_A(_, CC_B(_, _)), (_,CC_A(_, _))) => 6 
  case CC_B(CC_A(_, CC_C(_, _, _)), (_,CC_A(_, _))) => 7 
  case CC_B(CC_B(CC_A(_, _), _), (_,CC_A(_, _))) => 8 
  case CC_B(CC_B(CC_B(_, _), _), (_,CC_A(_, _))) => 9 
  case CC_B(CC_B(CC_C(_, _, _), _), (_,CC_A(_, _))) => 10 
  case CC_B(CC_C(_, _, _), (_,CC_A(_, _))) => 11 
  case CC_C(12, _, CC_B(_, _)) => 12 
  case CC_C(_, _, CC_B(_, _)) => 13 
}
}