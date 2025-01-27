package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_B[D], D], b: D, c: T_A[D, T_A[Char, Byte]]) extends T_A[T_B[D], D]
case class CC_B(a: CC_A[(Byte,Boolean)], b: CC_A[(Boolean,Int)], c: Boolean) extends T_A[T_B[T_A[T_B[CC_A[Boolean]], CC_A[Boolean]]], T_A[T_B[CC_A[Boolean]], CC_A[Boolean]]]
case class CC_C[E]() extends T_B[E]
case class CC_D[F](a: F, b: CC_B, c: T_A[F, T_A[CC_B, F]]) extends T_B[F]
case class CC_E[G](a: CC_B) extends T_B[G]

val v_a: T_A[T_B[T_A[T_B[CC_A[Boolean]], CC_A[Boolean]]], T_A[T_B[CC_A[Boolean]], CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, true) => 1 
  case CC_B(_, _, false) => 2 
}
}