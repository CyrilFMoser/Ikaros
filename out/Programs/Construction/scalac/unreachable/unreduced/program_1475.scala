package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[T_A[D], D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: (T_B[Char, Int],CC_A[Int])) extends T_B[T_A[E], E]
case class CC_C[F](a: Boolean, b: CC_B[F]) extends T_B[T_A[F], F]
case class CC_D[G](a: CC_A[G]) extends T_B[T_A[G], G]

val v_a: T_B[T_A[Char], Char] = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_C(_, CC_B(_)) => 1 
  case CC_D(CC_A(_, _, _)) => 2 
}
}