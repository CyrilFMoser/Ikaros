package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: T_A[C, D]) extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Boolean]], C]
case class CC_B[E](a: Boolean) extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Boolean]], E]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Char, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(true) => 1 
  case CC_B(false) => 2 
}
}