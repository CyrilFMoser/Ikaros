package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: Boolean, c: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Int) extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[E, E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, true, _) => 0 
  case CC_A(_, false, _) => 1 
  case CC_B(_) => 2 
  case CC_C(_) => 3 
}
}