package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B[G](a: G) extends T_B[T_A[G, G], G]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_B Byte
//      (CC_B Byte Wildcard Byte Wildcard (T_A Byte))
//      Wildcard
//      Wildcard
//      (T_A Byte))