package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_B[Byte, Boolean],T_A[(Byte,Byte)]), b: D, c: D) extends T_A[D]
case class CC_B(a: Char, b: Byte) extends T_A[CC_A[T_A[Byte]]]
case class CC_C(a: Boolean) extends T_A[CC_A[T_A[Byte]]]
case class CC_D[E, F](a: T_B[T_A[E], E], b: F) extends T_B[E, T_A[Int]]
case class CC_E[G]() extends T_B[G, T_A[Int]]
case class CC_F[H](a: H, b: T_B[H, H], c: H) extends T_B[T_B[H, H], H]

val v_a: T_B[Byte, T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E() => 1 
}
}