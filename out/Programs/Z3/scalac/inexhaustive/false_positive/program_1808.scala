package Program_30 

object Test {
sealed trait T_A[A]
case class CC_C(a: Int) extends T_A[T_A[Int]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A Byte Byte Wildcard Wildcard Wildcard (T_A Byte Byte))