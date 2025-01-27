package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Boolean]], C]
case class CC_B[D](a: CC_A[D], b: T_A[CC_A[D], D], c: Byte) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Boolean]], D]
case class CC_C[E](a: Boolean, b: Boolean) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Boolean]], E]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Boolean, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)