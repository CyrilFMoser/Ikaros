package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[T_A[Boolean]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_D Byte (CC_A Wildcard Wildcard (CC_B T_A) T_A) Wildcard Int (T_B Byte))