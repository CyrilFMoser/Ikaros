package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: Byte) extends T_A[D]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard Wildcard (T_A (T_A Byte Byte) Byte))