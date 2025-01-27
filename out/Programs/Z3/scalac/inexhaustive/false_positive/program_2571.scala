package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_C(a: Byte) extends T_A[T_A[T_B]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard (T_A Boolean (T_A Boolean (Tuple Int Boolean))))