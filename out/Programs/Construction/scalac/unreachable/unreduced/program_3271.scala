package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B(a: T_A[T_A[Char]], b: Char, c: T_A[T_A[Char]]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, CC_A(_, CC_A(_, _))) => 1 
  case CC_B(_, _, CC_A(_, CC_B(_, _, _))) => 2 
  case CC_B(_, _, CC_B(_, 'x', CC_A(_, _))) => 3 
  case CC_B(_, _, CC_B(_, 'x', CC_B(_, _, _))) => 4 
  case CC_B(_, _, CC_B(_, _, CC_A(_, _))) => 5 
  case CC_B(_, _, CC_B(_, _, CC_B(_, _, _))) => 6 
}
}