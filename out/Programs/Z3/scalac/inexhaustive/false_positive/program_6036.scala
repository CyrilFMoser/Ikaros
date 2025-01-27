package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, E](a: Int) extends T_A[E, D]

val v_a: CC_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_D Byte Wildcard Wildcard (T_B Byte))