package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Int], b: T_A[(Byte,Char)]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Char) extends T_A[T_A[T_A[Int]]]
case class CC_C[E, D](a: T_A[D], b: CC_A, c: ((CC_A,CC_A),T_B[CC_B, Char])) extends T_B[E, D]
case class CC_D[G, F](a: T_B[G, G], b: T_B[F, T_B[T_B[F, F], T_B[F, F]]]) extends T_B[G, F]
case class CC_E[I]() extends T_B[I, CC_A]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}