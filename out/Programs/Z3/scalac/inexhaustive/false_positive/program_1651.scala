package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[C]
case class CC_D[H](a: Int) extends T_B[H]

val v_a: CC_D[T_B[T_A]] = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: (CC_B Byte Int Wildcard Wildcard (T_A Int Byte))