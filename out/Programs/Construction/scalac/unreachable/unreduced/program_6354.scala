package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: Byte) extends T_A[Boolean, C]
case class CC_B[D](a: D, b: T_A[Boolean, D], c: T_A[Boolean, D]) extends T_A[Boolean, D]
case class CC_C[E]() extends T_A[E, CC_A[E]]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, CC_A(_, _, _)) => 1 
  case CC_B(_, _, CC_B(_, _, CC_A(_, _, _))) => 2 
  case CC_B(_, _, CC_B(_, _, CC_B(_, _, _))) => 3 
}
}