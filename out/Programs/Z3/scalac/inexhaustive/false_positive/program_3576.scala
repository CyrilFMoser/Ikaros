package Program_13 

object Test {
sealed trait T_A[A]
case class CC_B(a: Byte) extends T_A[T_A[(Byte,Char)]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_B Char Wildcard (T_A Char))