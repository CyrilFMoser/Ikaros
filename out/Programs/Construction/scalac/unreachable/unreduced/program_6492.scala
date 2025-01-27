package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Byte, Char], Byte], C]
case class CC_B[D](a: D) extends T_A[T_A[T_A[Byte, Char], Byte], D]
case class CC_C[E](a: T_A[CC_B[E], E], b: CC_B[E], c: T_A[E, E]) extends T_A[T_A[T_A[Byte, Char], Byte], E]

val v_a: T_A[T_A[T_A[Byte, Char], Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}