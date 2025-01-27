package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[(Byte,Int), C]) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Boolean]], C]
case class CC_B[D](a: CC_A[D], b: D) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Boolean]], D]
case class CC_C[E](a: E) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Boolean]], E]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Byte, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_C(_) => 2 
}
}