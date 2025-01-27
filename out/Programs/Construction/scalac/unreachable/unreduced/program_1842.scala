package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: T_B[E, E]) extends T_B[E, T_A[E]]
case class CC_C() extends T_B[T_A[T_A[Boolean]], T_A[T_A[T_A[Boolean]]]]
case class CC_D[F]() extends T_B[F, T_A[F]]

val v_a: T_B[Boolean, T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D() => 1 
}
}