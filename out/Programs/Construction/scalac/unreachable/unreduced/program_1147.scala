package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[(T_A[Boolean, Char],((Byte,Byte),Boolean)), C]
case class CC_B[D](a: D, b: CC_A[D], c: CC_A[D]) extends T_A[(T_A[Boolean, Char],((Byte,Byte),Boolean)), D]
case class CC_C[E](a: T_A[E, E], b: E, c: E) extends T_A[(T_A[Boolean, Char],((Byte,Byte),Boolean)), E]

val v_a: T_A[(T_A[Boolean, Char],((Byte,Byte),Boolean)), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(true, _, _) => 1 
  case CC_B(false, _, _) => 2 
  case CC_C(_, _, _) => 3 
}
}