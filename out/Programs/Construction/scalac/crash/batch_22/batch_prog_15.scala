package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[D, E], b: E) extends T_A[D, E]
case class CC_B[F, G](a: F, b: T_A[F, G]) extends T_A[F, G]
case class CC_C(a: T_A[T_A[Char, Int], T_B[Boolean]]) extends T_A[Char, CC_B[T_A[Byte, Byte], T_B[Int]]]
case class CC_D[H](a: CC_B[H, H], b: CC_C) extends T_B[H]
case class CC_E(a: CC_B[T_A[CC_C, CC_C], CC_D[CC_C]]) extends T_B[T_A[T_A[Int, CC_C], CC_A[(Int,Char), CC_C]]]
case class CC_F(a: CC_B[CC_D[CC_C], (CC_E,CC_E)], b: (CC_D[CC_C],CC_E)) extends T_B[T_A[T_A[Int, CC_C], CC_A[(Int,Char), CC_C]]]

val v_a: CC_D[CC_F] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
}
}