package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, Byte]
case class CC_B[F](a: F, b: T_A[F, Byte], c: T_A[F, F]) extends T_A[F, Byte]
case class CC_C(a: Byte, b: T_A[(Char,Char), Boolean], c: T_A[T_A[Char, Byte], Byte]) extends T_A[T_A[T_A[Int, (Boolean,Char)], Byte], Byte]

val v_a: T_A[T_A[T_A[Int, (Boolean,Char)], Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(0, _, CC_A()) => 1 
  case CC_C(_, _, CC_A()) => 2 
  case CC_C(0, _, CC_B(_, _, _)) => 3 
  case CC_C(_, _, CC_B(_, _, _)) => 4 
}
}
// This is not matched: CC_B(_, _, _)