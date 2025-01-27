package Program_13 

object Test {
sealed trait T_B[C]
case class CC_D[I](a: I) extends T_B[I]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: (CC_B T_A T_A)