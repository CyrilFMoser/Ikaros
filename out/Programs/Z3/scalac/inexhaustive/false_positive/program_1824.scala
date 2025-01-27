package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: Char, b: T_A[Boolean, D]) extends T_A[(Byte,Int), D]

val v_a: T_A[(Byte,Int), Boolean] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_B T_A)