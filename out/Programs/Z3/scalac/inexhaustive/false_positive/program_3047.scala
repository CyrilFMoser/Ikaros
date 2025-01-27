package Program_14 

object Test {
sealed trait T_A[A]
case class CC_C[D](a: D) extends T_A[D]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_C (CC_C (CC_B Boolean Boolean) (CC_B Boolean Boolean) Boolean Boolean)
//      (T_A (CC_B Boolean Boolean))
//      Wildcard
//      (T_B (CC_C (CC_B Boolean Boolean) (CC_B Boolean Boolean) Boolean Boolean)
//           (T_A (CC_B Boolean Boolean))))