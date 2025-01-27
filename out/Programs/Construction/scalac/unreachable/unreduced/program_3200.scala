package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[Boolean, T_A[Byte, Int]]) extends T_A[T_A[Char, T_A[Boolean, Int]], T_A[T_A[Char, T_A[Boolean, Int]], T_A[Char, T_A[Boolean, Int]]]]
case class CC_C[E, F](a: T_A[F, E], b: T_A[F, T_A[F, F]]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_C(_, _))) => 1 
  case CC_A(CC_C(_, _)) => 2 
  case CC_C(_, _) => 3 
}
}