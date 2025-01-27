package Program_12 

object Test {
sealed trait T_A[A]
case class CC_B[D](a: D) extends T_A[D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants