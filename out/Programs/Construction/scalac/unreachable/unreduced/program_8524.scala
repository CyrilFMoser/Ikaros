package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Boolean, C]
case class CC_B[D](a: T_A[D, D]) extends T_A[Byte, D]
case class CC_C[E](a: E, b: Boolean) extends T_A[Byte, E]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C('x', _) => 1 
  case CC_C(_, _) => 2 
}
}