package Program_31 

object Test {
sealed trait T_B[C, D]
case class CC_C[I, H](a: Char) extends T_B[H, I]

val v_a: CC_C[Int, Int] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_A Int Wildcard Wildcard Wildcard (T_A Int (T_B Int)))