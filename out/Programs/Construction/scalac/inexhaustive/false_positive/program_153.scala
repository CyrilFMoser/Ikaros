package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B() extends T_A[T_B[CC_A[(Boolean,Int)]]]
case class CC_C[E]() extends T_B[E]
case class CC_D[F]() extends T_B[F]
case class CC_E(a: T_B[Byte]) extends T_B[CC_B]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_C()) => 0 
}
}
// This is not matched: CC_A(CC_B())