package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_A[C]) extends T_A[Byte]
case class CC_B(a: T_A[T_B[Boolean]], b: CC_A[(Int,Int)]) extends T_A[Byte]
case class CC_C[D](a: CC_B) extends T_B[D]
case class CC_D[E](a: T_B[E]) extends T_B[E]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}