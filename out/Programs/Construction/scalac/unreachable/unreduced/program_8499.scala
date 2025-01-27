package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]], b: T_A[T_A[C, C], C], c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[E](a: Char) extends T_A[T_A[E, E], E]
case class CC_C[F](a: T_A[F, F], b: F) extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_, _, _)