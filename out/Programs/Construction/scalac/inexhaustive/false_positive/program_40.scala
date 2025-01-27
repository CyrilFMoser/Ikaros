package Program_63 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[Byte, Byte], b: T_B[((Boolean,Boolean),Int)]) extends T_A[T_B[T_B[Byte]], Byte]
case class CC_C[E]() extends T_B[E]
case class CC_D[F]() extends T_B[F]

val v_a: T_A[T_B[T_B[Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
}
}
// This is not matched: CC_A(_)