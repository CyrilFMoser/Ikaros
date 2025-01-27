package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[D, C](a: D) extends T_B[D, C]

val v_a: CC_C[T_A, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_A (CC_A (CC_B T_A) T_A) T_A)