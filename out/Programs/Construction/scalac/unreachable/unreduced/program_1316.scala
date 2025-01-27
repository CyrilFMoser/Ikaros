package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_A[T_A[T_B]], c: T_A[Char]) extends T_A[T_A[T_B]]
case class CC_B(a: Char, b: CC_A) extends T_A[T_A[T_B]]

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 0 
  case CC_A(CC_B(_, _), CC_A(_, _, _), _) => 1 
  case CC_A(CC_A(_, _, _), CC_B(_, _), _) => 2 
  case CC_B(_, _) => 3 
}
}
// This is not matched: CC_A(CC_B(_, _), CC_B(_, _), _)