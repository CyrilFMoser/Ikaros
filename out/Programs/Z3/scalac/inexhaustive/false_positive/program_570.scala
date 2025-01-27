package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_B[G, F](a: Char) extends T_A[G, F]

val v_a: CC_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (CC_A Char Byte Boolean (T_A Char Byte))
//      Wildcard
//      (T_A (CC_A Byte Boolean Byte Boolean) (Tuple Boolean Boolean)))