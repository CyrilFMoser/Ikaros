package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_B[Byte],T_B[Byte]), b: T_A[T_B[D], D], c: Byte) extends T_A[T_B[T_A[Int, Int]], D]
case class CC_B[E](a: Boolean, b: T_A[CC_A[E], E], c: T_A[E, E]) extends T_B[E]
case class CC_C[F](a: T_B[F], b: Byte, c: F) extends T_B[F]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}