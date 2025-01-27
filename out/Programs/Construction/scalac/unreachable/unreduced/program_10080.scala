package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: Boolean) extends T_A[T_A[Char]]
case class CC_B(a: CC_A, b: CC_A, c: T_A[Boolean]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(CC_A(_, _), true), CC_A(_, _), _) => 1 
  case CC_B(CC_A(CC_B(_, _, _), true), CC_A(_, _), _) => 2 
  case CC_B(CC_A(CC_A(_, _), false), CC_A(_, _), _) => 3 
  case CC_B(CC_A(CC_B(_, _, _), false), CC_A(_, _), _) => 4 
}
}