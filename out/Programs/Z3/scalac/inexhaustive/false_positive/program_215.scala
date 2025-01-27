package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[D], b: Byte) extends T_A[D, E]
case class CC_C() extends T_B[CC_A[(Char,Boolean), Int]]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_B Char Byte (T_A Char Byte))