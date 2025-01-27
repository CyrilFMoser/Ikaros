package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: C, c: T_A[C, D]) extends T_A[T_A[Byte, T_A[Boolean, (Byte,Int)]], C]
case class CC_B[E](a: Char) extends T_A[CC_A[(Boolean,Boolean), T_A[Byte, Boolean]], E]
case class CC_C[F](a: Char, b: T_A[F, F], c: F) extends T_A[CC_A[(Boolean,Boolean), T_A[Byte, Boolean]], F]

val v_a: T_A[CC_A[(Boolean,Boolean), T_A[Byte, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
}
}