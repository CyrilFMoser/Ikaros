package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: CC_A[Int], b: CC_A[E]) extends T_B[E, Byte]
case class CC_C[F, G](a: F, b: T_B[CC_A[(Boolean,Byte)], F]) extends T_B[F, Byte]
case class CC_D[H]() extends T_B[H, Byte]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(12), CC_A(_)) => 0 
  case CC_B(CC_A(_), CC_A(_)) => 1 
  case CC_C(_, _) => 2 
  case CC_D() => 3 
}
}