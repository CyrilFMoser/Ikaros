package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: E, b: T_A[E, E], c: T_B[F, F]) extends T_A[E, F]
case class CC_B[G, H]() extends T_A[G, H]
case class CC_C[I](a: (T_B[Boolean, Byte],T_B[Int, Byte])) extends T_B[I, T_A[Boolean, I]]
case class CC_D[J](a: J) extends T_B[J, T_A[Boolean, J]]
case class CC_E[K](a: K, b: T_A[T_B[K, K], K]) extends T_B[CC_A[Byte, T_B[(Boolean,Int), (Byte,Char)]], K]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}