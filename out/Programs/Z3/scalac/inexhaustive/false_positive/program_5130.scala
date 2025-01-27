package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_B[D, C](a: Byte) extends T_B[D, C]

val v_a: CC_B[T_A, Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants