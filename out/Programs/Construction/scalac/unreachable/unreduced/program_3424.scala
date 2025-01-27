package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[Int, T_A[Boolean]]]
case class CC_B(a: T_A[Boolean]) extends T_A[T_B[Int, T_A[Boolean]]]
case class CC_C() extends T_A[T_B[Int, T_A[Boolean]]]
case class CC_D[E, D](a: T_B[D, D], b: (T_A[CC_B],CC_A), c: E) extends T_B[E, D]
case class CC_E[F, G]() extends T_B[T_B[F, F], F]
case class CC_F[H](a: CC_A) extends T_B[T_B[H, H], H]

val v_a: T_B[T_B[CC_B, CC_B], CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(CC_D(_, _, _), (_,_), CC_B(_)), (_,CC_A()), CC_D(CC_D(_, _, _), (_,_), CC_B(_))) => 0 
  case CC_E() => 1 
  case CC_F(CC_A()) => 2 
}
}