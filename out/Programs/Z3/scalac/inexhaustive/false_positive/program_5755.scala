package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: Char) extends T_A[D, T_A[Char, (Byte,Int)]]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A Char Wildcard Wildcard Wildcard (T_A Boolean Char))