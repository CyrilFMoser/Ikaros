package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[T_A[T_A[Int, Byte], T_A[Int, Byte]], T_A[Int, Byte]], c: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[E](a: T_A[CC_A[E], E]) extends T_A[T_A[E, E], E]
case class CC_C[F]() extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)