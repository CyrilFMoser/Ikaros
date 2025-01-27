package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B(a: Char) extends T_A[(Char,Byte), T_A[Int, Int]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A (CC_A Char Boolean) (T_A (CC_A Char Boolean)))