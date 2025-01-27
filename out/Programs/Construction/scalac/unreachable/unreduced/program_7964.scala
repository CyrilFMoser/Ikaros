package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: T_A[Int]) extends T_A[T_A[T_B[(Int,Boolean), Boolean]]]
case class CC_C(a: T_B[(CC_B,CC_B), (CC_B,CC_B)], b: T_B[Boolean, T_A[CC_B]]) extends T_A[T_A[T_B[(Int,Boolean), Boolean]]]
case class CC_D[E](a: E) extends T_B[E, T_A[T_A[CC_C]]]
case class CC_E[F](a: CC_B) extends T_B[F, T_A[F]]
case class CC_F[G](a: CC_B, b: G) extends T_B[G, T_A[G]]

val v_a: T_A[T_A[T_B[(Int,Boolean), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(CC_A())