package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[D, D]]
case class CC_B[E, F](a: CC_A[E], b: T_B[F], c: E) extends T_A[E, F]
case class CC_C[G](a: (CC_A[(Boolean,Byte)],CC_B[Boolean, Char]), b: (T_A[Byte, Int],CC_A[Int]), c: CC_B[T_A[G, G], G]) extends T_A[G, T_A[G, G]]
case class CC_D[H](a: H) extends T_B[T_A[T_B[Int], (Char,Int)]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_C((CC_A(),CC_B(_, _, _)), (CC_B(_, _, _),CC_A()), _) => 2 
}
}