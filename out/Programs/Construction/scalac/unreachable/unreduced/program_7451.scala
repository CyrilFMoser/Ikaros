package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_B[Int, Boolean]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[T_B[Int, Boolean]]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[T_A[T_B[Int, Boolean]]]
case class CC_D[D]() extends T_B[T_B[D, D], D]
case class CC_E[E, F](a: T_A[E]) extends T_B[F, E]
case class CC_F[G, H](a: Int, b: CC_D[T_A[Int]], c: T_B[G, G]) extends T_B[G, H]

val v_a: T_A[T_A[T_B[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}