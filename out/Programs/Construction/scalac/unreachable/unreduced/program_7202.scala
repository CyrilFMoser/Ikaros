package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: Boolean, c: T_A[T_A[Int]]) extends T_A[T_A[(Int,Byte)]]
case class CC_B() extends T_A[CC_A]
case class CC_C(a: CC_A, b: (CC_A,T_B[(Boolean,Byte), CC_B])) extends T_A[CC_A]
case class CC_D[E, D]() extends T_B[D, E]
case class CC_E[F, G](a: Boolean, b: Byte, c: (Byte,T_A[CC_C])) extends T_B[F, G]
case class CC_F[H](a: T_B[H, H]) extends T_B[H, CC_D[H, H]]

val v_a: T_A[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _, _), (CC_A(_, _, _),CC_D())) => 1 
  case CC_C(CC_A(_, _, _), (CC_A(_, _, _),CC_E(_, _, _))) => 2 
}
}