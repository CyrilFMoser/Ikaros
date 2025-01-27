package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[Int, D], b: D) extends T_A[(T_A[Boolean, (Char,Byte)],Int), D]
case class CC_B[E](a: CC_A[E]) extends T_A[(T_A[Boolean, (Char,Byte)],Int), E]
case class CC_C() extends T_A[(T_A[Boolean, (Char,Byte)],Int), Boolean]

val v_a: T_A[(T_A[Boolean, (Char,Byte)],Int), Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _)