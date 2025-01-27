package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int) extends T_A[T_A[Char, Byte], T_A[Byte, Boolean]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Boolean Int Boolean Char Wildcard (T_A Int Boolean))