package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Char, Int], T_B[Boolean, Char]], b: T_A[T_B[Int, Byte]], c: T_B[T_B[Byte, Int], T_B[(Int,Boolean), Boolean]]) extends T_A[T_A[T_A[Int]]]
case class CC_B[D](a: T_A[D]) extends T_A[T_A[T_A[Int]]]
case class CC_C[F, E](a: CC_B[F], b: T_B[F, F]) extends T_B[F, E]
case class CC_D[G](a: CC_B[G]) extends T_B[T_A[G], G]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _), _, CC_C(_, _)) => 0 
  case CC_B(_) => 1 
}
}