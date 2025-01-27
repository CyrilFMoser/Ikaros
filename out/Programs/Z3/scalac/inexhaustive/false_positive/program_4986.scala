package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: D) extends T_A[D, T_A[D, D]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Char))