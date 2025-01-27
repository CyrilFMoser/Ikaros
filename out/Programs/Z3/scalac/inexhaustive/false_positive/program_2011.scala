package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[Boolean], Byte]
case class CC_D[F](a: F, b: T_A[F, F]) extends T_B[F]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D('x', _) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (Tuple Int Byte)))