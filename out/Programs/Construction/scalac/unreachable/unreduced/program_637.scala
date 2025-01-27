package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]]) extends T_A[T_A[C, C], C]
case class CC_B[E](a: CC_A[E], b: T_A[T_A[E, E], E], c: Char) extends T_A[T_A[E, E], E]
case class CC_C[F](a: F) extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_A(CC_C(_)) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(_) => 4 
}
}