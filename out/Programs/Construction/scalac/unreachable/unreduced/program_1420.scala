package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, C], b: T_A, c: T_B[C, C]) extends T_A
case class CC_B[D, E]() extends T_B[T_B[D, D], D]
case class CC_C[F](a: CC_A[F], b: F, c: T_B[F, F]) extends T_B[T_B[F, F], F]
case class CC_D[G](a: (T_A,CC_B[(Int,Byte), T_A])) extends T_B[T_B[G, G], G]

val v_a: T_B[T_B[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
  case CC_D((_,_)) => 2 
}
}