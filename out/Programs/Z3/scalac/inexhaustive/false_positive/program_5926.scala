package Program_15 

object Test {
sealed trait T_B[B, C]
case class CC_B[E](a: E, b: T_B[E, E]) extends T_B[E, Int]

val v_a: T_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(0, _) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard (T_A (T_A Int)))