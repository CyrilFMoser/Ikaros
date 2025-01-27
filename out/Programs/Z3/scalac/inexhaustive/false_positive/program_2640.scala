package Program_31 

object Test {
sealed trait T_B[B, C]
case class CC_B[D](a: D, b: T_B[D, D]) extends T_B[Char, D]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: (CC_F T_B)