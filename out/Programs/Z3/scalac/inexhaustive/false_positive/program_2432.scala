package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_B[D](a: Byte) extends T_B[T_A[D], D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_D Boolean Wildcard Wildcard Wildcard (T_B Boolean))