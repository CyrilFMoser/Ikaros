package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Char]], C]
case class CC_B[D](a: D, b: CC_A[D]) extends T_A[(CC_A[Boolean],Char), D]
case class CC_C[E](a: E) extends T_A[(CC_A[Boolean],Char), E]

val v_a: T_A[(CC_A[Boolean],Char), Boolean] = null
val v_b: Int = v_a match{
  case CC_B(true, CC_A(_, _, _)) => 0 
  case CC_B(false, CC_A(_, _, _)) => 1 
  case CC_C(_) => 2 
}
}