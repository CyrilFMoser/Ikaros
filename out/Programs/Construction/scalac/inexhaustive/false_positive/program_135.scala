package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_C[F]() extends T_A[F]
case class CC_D(a: T_A[(Byte,Byte)]) extends T_B[CC_C[T_B[Int, Char]], CC_A[T_A[Byte]]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_C()) => 0 
}
}
// This is not matched: CC_A(CC_B(CC_B(_)))