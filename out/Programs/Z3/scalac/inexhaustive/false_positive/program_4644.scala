package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Char, Char], b: Byte) extends T_A[T_A[Char, Int], T_A[Char, Boolean]]

val v_a: T_A[T_A[Char, Int], T_A[Char, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_B T_A T_A)