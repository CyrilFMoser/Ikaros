package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_A[F, T_B[F, F]], b: F, c: T_B[F, F]) extends T_A[F, T_B[F, F]]
case class CC_C[G](a: T_A[G, T_B[G, G]]) extends T_B[T_A[CC_B[Byte], T_B[CC_B[Byte], CC_B[Byte]]], G]
case class CC_D(a: CC_A[T_B[Boolean, Int]]) extends T_B[T_A[CC_B[Byte], T_B[CC_B[Byte], CC_B[Byte]]], T_A[CC_A[Char], T_B[CC_A[Char], CC_A[Char]]]]

val v_a: T_B[T_A[CC_B[Byte], T_B[CC_B[Byte], CC_B[Byte]]], CC_D] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_C(CC_B(CC_A(), CC_D(_), _)) => 1 
  case CC_C(CC_B(CC_B(_, _, _), CC_D(_), _)) => 2 
}
}