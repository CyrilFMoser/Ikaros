package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_E[E](a: (CC_A,Char)) extends T_B[E, Char]

val v_a: CC_E[Int] = null
val v_b: Int = v_a match{
  case CC_E((_,'x')) => 0 
}
}
// This is not matched: (CC_A (CC_B T_A) T_A)