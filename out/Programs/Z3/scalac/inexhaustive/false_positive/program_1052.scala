package Program_31 

object Test {
sealed trait T_B[A, B]
case class CC_C[E, F](a: Int) extends T_B[E, F]

val v_a: CC_C[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A Char Wildcard Wildcard (T_A Char))