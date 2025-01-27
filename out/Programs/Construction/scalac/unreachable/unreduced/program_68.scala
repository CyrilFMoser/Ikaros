package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_B[E](a: (T_B[Int],T_A[Char, Boolean])) extends T_A[T_A[E, E], E]
case class CC_C[F](a: Int, b: T_B[F]) extends T_B[F]
case class CC_D[G](a: (T_B[Boolean],CC_C[Int])) extends T_B[G]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
  case CC_B((_,_)) => 2 
}
}