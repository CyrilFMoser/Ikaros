package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_B(a: Byte) extends T_A[T_A[Char, Char], Char]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_B Char Boolean Boolean Wildcard (T_A Char Boolean))