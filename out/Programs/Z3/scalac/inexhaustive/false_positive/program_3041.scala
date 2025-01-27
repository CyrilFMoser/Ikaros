package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: T_A[D, D], b: Char) extends T_A[Int, D]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, 'x') => 0 
}
}
// This is not matched: (CC_D T_A Byte T_A (T_B Byte T_A))