package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: D) extends T_A[D, C]

val v_a: CC_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants