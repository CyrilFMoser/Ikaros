package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Byte) extends T_A[T_B[T_A[Char, Byte]], D]
case class CC_B[E](a: (CC_A[Boolean],Byte), b: CC_A[E], c: E) extends T_A[T_B[T_A[Char, Byte]], E]
case class CC_C[F](a: CC_A[F], b: (CC_B[Int],CC_B[Int])) extends T_A[T_B[T_A[Char, Byte]], F]
case class CC_D[G](a: CC_B[G], b: G, c: CC_B[G]) extends T_B[G]

val v_a: T_A[T_B[T_A[Char, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_, 0), _) => 2 
  case CC_C(CC_A(_, _), _) => 3 
}
}