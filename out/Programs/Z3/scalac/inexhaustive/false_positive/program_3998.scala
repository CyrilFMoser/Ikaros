package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C, D](a: C) extends T_B[C, D]

val v_a: CC_B[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_A Byte)))