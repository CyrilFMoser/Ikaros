package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: T_B) extends T_A[D, C]
case class CC_B() extends T_B
case class CC_C() extends T_B

val v_a: CC_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_C()) => 0 
}
}
// This is not matched: (CC_E (T_B (T_A Char)))