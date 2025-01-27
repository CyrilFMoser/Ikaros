package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: (T_A[Int],T_B[Boolean, Boolean]), c: (T_B[Byte, Int],T_A[Char])) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_B[F, F], b: T_B[F, F], c: CC_A[F]) extends T_A[F]
case class CC_D[G](a: CC_B[G], b: Int, c: CC_A[G]) extends T_B[T_B[Int, T_A[Int]], G]
case class CC_E(a: CC_B[T_A[Byte]], b: T_B[T_A[Int], Char]) extends T_B[T_A[T_A[Int]], CC_C[T_A[Boolean]]]
case class CC_F[H]() extends T_B[T_B[Int, T_A[Int]], H]

val v_a: T_B[T_B[Int, T_A[Int]], Char] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A(true, _, (_,_))) => 0 
  case CC_D(_, _, CC_A(false, _, (_,_))) => 1 
  case CC_F() => 2 
}
}