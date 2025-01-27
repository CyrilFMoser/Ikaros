package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: Byte) extends T_A[C]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B Byte Wildcard Wildcard Wildcard (T_A Byte Char))