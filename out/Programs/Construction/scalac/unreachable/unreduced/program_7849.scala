package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B(a: T_A[T_A[Int]]) extends T_A[T_B[Int, T_A[Int]]]
case class CC_C[E](a: T_A[E], b: (CC_B,T_A[CC_B]), c: T_B[E, E]) extends T_A[E]
case class CC_D[F](a: F, b: Int, c: CC_C[F]) extends T_B[F, Char]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_C(_, _, _))) => 1 
  case CC_A(CC_C(_, _, _)) => 2 
  case CC_C(_, _, _) => 3 
}
}