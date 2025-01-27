package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D, c: D) extends T_A[D]
case class CC_B[E](a: Int, b: CC_A[E], c: Byte) extends T_B[(T_A[(Int,Boolean)],T_A[Byte]), E]
case class CC_C[F](a: T_A[F]) extends T_B[(T_A[(Int,Boolean)],T_A[Byte]), F]
case class CC_D(a: T_A[T_A[Boolean]], b: CC_B[CC_C[Int]]) extends T_B[CC_C[T_A[Boolean]], T_A[T_A[Int]]]

val v_a: T_B[(T_A[(Int,Boolean)],T_A[Byte]), CC_D] = null
val v_b: Int = v_a match{
  case CC_B(_, _, 0) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_, _, _)) => 2 
}
}