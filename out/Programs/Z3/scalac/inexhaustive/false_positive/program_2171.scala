package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_C(a: Byte) extends T_A[T_A[Boolean, Char], T_A[Boolean, Byte]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard (T_A (T_A Byte)))