package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, Byte]]
case class CC_B(a: (T_A[Int, Char],CC_A[(Int,Char)]), b: CC_A[T_A[Byte, Char]], c: T_A[T_A[Int, Int], T_B[T_A[Int, Int], Byte]]) extends T_A[(T_B[Int, Byte],T_B[Boolean, Int]), T_B[(T_B[Int, Byte],T_B[Boolean, Int]), Byte]]
case class CC_C[F](a: CC_B, b: F, c: T_B[F, F]) extends T_A[F, T_B[F, Byte]]
case class CC_D[H, G](a: (T_A[(Char,Int), CC_B],T_B[CC_B, CC_B])) extends T_B[H, G]
case class CC_E[J, I](a: CC_A[T_A[I, J]], b: CC_B) extends T_B[I, J]
case class CC_F[K]() extends T_B[K, T_A[K, T_B[K, Byte]]]

val v_a: T_B[Int, T_A[Int, T_B[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_D((_,_)) => 0 
  case CC_E(CC_A(), CC_B(_, _, _)) => 1 
  case CC_F() => 2 
}
}