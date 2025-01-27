package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_B[E, E], c: E) extends T_A[E, T_B[E, E]]
case class CC_B(a: T_A[T_A[Char, Int], T_B[T_A[Char, Int], T_A[Char, Int]]], b: T_A[Boolean, T_B[Boolean, Boolean]], c: T_A[T_A[Boolean, Byte], T_B[T_A[Boolean, Byte], T_A[Boolean, Byte]]]) extends T_A[Boolean, T_B[Boolean, Boolean]]
case class CC_C[F, G](a: CC_A[G], b: F) extends T_B[F, G]

val v_a: T_A[Boolean, T_B[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, CC_C(_, _), _), CC_A(_, CC_C(_, _), true), CC_A(_, _, _)) => 1 
  case CC_B(CC_A(_, CC_C(_, _), _), CC_A(_, CC_C(_, _), false), CC_A(_, _, _)) => 2 
}
}
// This is not matched: CC_B(CC_A(_, CC_C(_, _), _), CC_B(_, _, _), CC_A(_, _, _))