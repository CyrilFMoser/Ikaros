package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_B[Boolean, Boolean],T_A[Int]), b: D, c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F](a: F, b: T_A[F], c: CC_A[F]) extends T_B[T_A[T_B[Int, Byte]], F]
case class CC_D(a: CC_C[CC_C[Byte]]) extends T_B[Byte, Byte]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _, _)), _, _) => 0 
  case CC_A((_,CC_B(_)), _, _) => 1 
  case CC_B(CC_A((_,_), _, _)) => 2 
  case CC_B(CC_B(CC_A(_, _, _))) => 3 
  case CC_B(CC_B(CC_B(_))) => 4 
}
}