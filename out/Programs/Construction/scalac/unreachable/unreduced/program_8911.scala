package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: Byte) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: F) extends T_B[F, CC_B[T_B[Byte, Byte]]]
case class CC_D[G](a: T_A[G]) extends T_B[G, CC_B[T_B[Byte, Byte]]]
case class CC_E() extends T_B[CC_B[CC_A[Byte]], CC_B[T_B[Byte, Byte]]]

val v_a: T_B[Byte, CC_B[T_B[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_A(_, 0)) => 1 
  case CC_D(CC_B()) => 2 
}
}
// This is not matched: CC_D(CC_A(_, _))