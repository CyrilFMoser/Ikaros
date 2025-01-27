package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, T_A[T_B, T_A[T_B, T_B]]], b: C, c: T_B) extends T_A[T_B, C]
case class CC_B[E](a: T_A[T_B, E], b: CC_A[E], c: T_A[E, E]) extends T_A[T_B, E]
case class CC_C() extends T_A[T_B, Int]

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _, _) => 0 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _, _) => 1 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _, _) => 2 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _, _) => 3 
  case CC_A(CC_B(_, CC_A(_, _, _), _), _, _) => 4 
  case CC_B(_, CC_A(CC_A(_, _, _), _, _), _) => 5 
}
}
// This is not matched: CC_B(_, CC_A(CC_B(_, _, _), _, _), _)