package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: Byte, b: E) extends T_A[E]
case class CC_C[F]() extends T_B[T_A[T_A[Char]], F]
case class CC_D[G](a: G) extends T_B[(Boolean,T_A[Byte]), G]
case class CC_E(a: Boolean, b: Byte, c: CC_B[Byte]) extends T_B[T_A[CC_A[Int]], CC_A[(Int,Char)]]

val v_a: T_A[CC_E] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _), _, _) => 0 
  case CC_B(_, CC_E(_, _, _)) => 1 
}
}
// This is not matched: CC_A(CC_A(_, _, _), _, _)