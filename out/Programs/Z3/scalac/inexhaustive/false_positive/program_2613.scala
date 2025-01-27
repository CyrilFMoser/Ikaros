package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[Char]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B Byte Int Wildcard Wildcard (T_A Byte Int))