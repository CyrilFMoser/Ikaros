package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_C[E](a: Byte) extends T_A[E, (Char,Char)]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A Int))