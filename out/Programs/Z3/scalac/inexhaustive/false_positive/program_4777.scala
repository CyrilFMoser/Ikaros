package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Int) extends T_A[D, C]
case class CC_B() extends T_A[T_A[Char, Char], Byte]

val v_a: CC_A[CC_B, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_C (T_A (T_B Boolean Byte)))