package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[Boolean, T_A[Int, Int]], C]
case class CC_B[D](a: D) extends T_A[T_A[Boolean, T_A[Int, Int]], D]
case class CC_C[E]() extends T_A[T_A[Boolean, T_A[Int, Int]], E]

val v_a: T_A[T_A[Boolean, T_A[Int, Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)