package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[Int]]
case class CC_B(a: (CC_A,CC_A), b: T_B[CC_A, CC_A]) extends T_A[T_A[Int]]
case class CC_C(a: Byte, b: CC_A, c: T_B[T_B[CC_B, CC_A], CC_A]) extends T_A[T_A[Int]]
case class CC_D[D](a: D, b: T_A[D]) extends T_B[D, T_B[(Boolean,CC_B), CC_A]]
case class CC_E[E](a: Byte) extends T_B[E, T_B[(Boolean,CC_B), CC_A]]
case class CC_F[F, G](a: F, b: CC_B) extends T_B[F, T_B[(Boolean,CC_B), CC_A]]

val v_a: T_B[CC_C, T_B[(Boolean,CC_B), CC_A]] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _, _), _) => 0 
  case CC_E(_) => 1 
  case CC_F(CC_C(_, _, _), CC_B(_, _)) => 2 
}
}