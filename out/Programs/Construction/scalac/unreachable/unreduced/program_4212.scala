package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Char, Byte], T_A[Boolean, Byte]], C]
case class CC_B[D](a: D, b: D, c: Boolean) extends T_A[T_A[T_A[Char, Byte], T_A[Boolean, Byte]], D]
case class CC_C[E](a: CC_A[E], b: CC_B[E]) extends T_A[T_A[T_A[Char, Byte], T_A[Boolean, Byte]], E]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[Boolean, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_), CC_B(_, _, _)) => 2 
}
}