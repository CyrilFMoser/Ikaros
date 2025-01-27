package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean) extends T_A[T_B[T_A[Boolean, Byte], T_B[Byte, Boolean]], E]
case class CC_B(a: CC_A[Byte], b: T_B[Int, Int], c: T_A[CC_A[Byte], T_A[Byte, Boolean]]) extends T_A[T_B[T_A[Boolean, Byte], T_B[Byte, Boolean]], Int]
case class CC_C[F, G]() extends T_B[F, G]

val v_a: T_A[T_B[T_A[Boolean, Byte], T_B[Byte, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}