package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[(Boolean,Byte)], b: T_A[T_B[Int, Byte]], c: T_B[T_A[Int], Boolean]) extends T_A[T_A[(Boolean,Byte)]]
case class CC_B(a: T_B[(Boolean,CC_A), T_A[Boolean]], b: T_A[T_B[CC_A, CC_A]], c: Byte) extends T_A[T_A[(Boolean,Byte)]]
case class CC_C() extends T_A[T_A[(Boolean,Byte)]]
case class CC_D[D, E](a: T_B[CC_A, E], b: (CC_A,Char)) extends T_B[E, D]
case class CC_E[F](a: (CC_C,(CC_C,CC_B)), b: Char) extends T_B[F, CC_D[F, F]]
case class CC_F[H, G]() extends T_B[H, G]

val v_a: T_A[T_A[(Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}