package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: T_A[C, T_B]) extends T_A[(Byte,Int), C]

val v_a: T_A[(Byte,Int), T_B] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants