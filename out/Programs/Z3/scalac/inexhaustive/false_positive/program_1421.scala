package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_D[D](a: D, b: T_B[D, D]) extends T_B[T_A, D]

val v_a: T_B[T_A, Byte] = null
val v_b: Int = v_a match{
  case CC_D(0, _) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard Wildcard (T_A (T_B Byte Byte) Byte))