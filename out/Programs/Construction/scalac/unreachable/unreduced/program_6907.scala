package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[T_A[Char]], c: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B(a: T_A[T_A[Char]], b: T_A[T_A[Int]]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_B(CC_B(CC_A(_, _, _), _), _) => 2 
}
}
// This is not matched: CC_B(CC_B(CC_B(_, _), _), _)