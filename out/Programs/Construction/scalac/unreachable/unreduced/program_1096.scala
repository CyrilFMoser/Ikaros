package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[Byte, E]) extends T_A[T_B[T_A[(Boolean,Byte), Boolean], ((Int,Boolean),Byte)], E]
case class CC_B[F](a: T_B[F, F], b: T_A[F, F], c: T_A[F, F]) extends T_A[T_B[T_A[(Boolean,Byte), Boolean], ((Int,Boolean),Byte)], F]
case class CC_C[G](a: G, b: T_B[G, G]) extends T_A[T_B[T_A[(Boolean,Byte), Boolean], ((Int,Boolean),Byte)], G]

val v_a: T_A[T_B[T_A[(Boolean,Byte), Boolean], ((Int,Boolean),Byte)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}