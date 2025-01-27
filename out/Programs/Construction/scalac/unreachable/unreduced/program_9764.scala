package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: D) extends T_A[T_A[Byte, T_B[Int]], D]
case class CC_B[E](a: T_A[E, E], b: CC_A[E]) extends T_A[T_A[Byte, T_B[Int]], E]
case class CC_C[F]() extends T_B[F]
case class CC_D[G]() extends T_B[G]

val v_a: T_A[T_A[Byte, T_B[Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(CC_C(), _)) => 1 
}
}
// This is not matched: CC_B(_, CC_A(CC_D(), _))