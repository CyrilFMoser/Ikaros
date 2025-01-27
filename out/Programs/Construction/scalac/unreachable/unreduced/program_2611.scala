package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_B[E, T_A[E, E]], c: T_B[E, E]) extends T_A[T_A[E, E], E]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[T_A[Byte, Byte], Byte], T_A[T_A[Byte, Byte], Byte]], T_A[T_A[Byte, Byte], Byte]]
case class CC_C[G, F](a: Byte, b: (Int,(CC_B,CC_B)), c: CC_B) extends T_B[G, F]
case class CC_D[H, I](a: T_B[T_A[CC_C[Int, (Boolean,Boolean)], I], T_A[CC_C[Int, (Boolean,Boolean)], I]], b: T_A[CC_B, I]) extends T_B[H, I]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _, _), CC_C(_, _, _)) => 0 
  case CC_A(_, CC_C(_, _, _), CC_D(_, _)) => 1 
  case CC_A(_, CC_D(CC_C(_, _, _), _), CC_C(_, _, _)) => 2 
  case CC_A(_, CC_D(CC_C(_, _, _), _), CC_D(_, _)) => 3 
  case CC_A(_, CC_D(CC_D(_, _), _), CC_C(_, _, _)) => 4 
}
}
// This is not matched: CC_A(_, CC_D(CC_D(_, _), _), CC_D(_, _))