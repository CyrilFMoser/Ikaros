package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Char) extends T_A[C, T_A[T_A[Int, Byte], T_A[Boolean, Char]]]
case class CC_B[D](a: CC_A[D]) extends T_A[Boolean, D]
case class CC_C[E]() extends T_A[Boolean, E]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, 'x')) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_C() => 2 
}
}