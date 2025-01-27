package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[(Byte,Byte), C], b: T_A[T_A[C, C], C], c: T_A[C, C]) extends T_A[C, T_A[T_A[(Int,Boolean), Byte], T_A[Char, Byte]]]
case class CC_B[D](a: CC_A[D], b: Byte) extends T_A[D, T_A[T_A[(Int,Boolean), Byte], T_A[Char, Byte]]]
case class CC_C[E, F](a: E, b: CC_A[F], c: T_A[E, E]) extends T_A[E, T_A[T_A[(Int,Boolean), Byte], T_A[Char, Byte]]]

val v_a: T_A[Boolean, T_A[T_A[(Int,Boolean), Byte], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)