package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[C, C], C], C]
case class CC_B[D](a: (T_A[Boolean, Byte],Boolean)) extends T_A[T_A[T_A[D, D], D], D]
case class CC_C[E](a: (CC_B[Char],CC_A[Boolean]), b: E) extends T_A[T_A[T_A[E, E], E], E]

val v_a: T_A[T_A[T_A[Int, Int], Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C((CC_B(_),CC_A(_, _)), _)