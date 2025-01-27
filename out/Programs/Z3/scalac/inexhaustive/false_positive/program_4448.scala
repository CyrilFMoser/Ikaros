package Program_13 

object Test {
sealed trait T_B[B]
case class CC_D[E](a: Int) extends T_B[E]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard (T_A Byte))