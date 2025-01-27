package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Char) extends T_A[T_B[Char, Int], T_A[Byte, (Int,Int)]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B T_A)