package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[Char]], c: T_A[T_A[Boolean]]) extends T_A[T_A[Char]]
case class CC_B(a: Boolean, b: T_A[T_A[Char]]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, _), _) => 1 
  case CC_B(_, CC_A(_, _, _)) => 2 
  case CC_B(_, CC_B(_, _)) => 3 
}
}