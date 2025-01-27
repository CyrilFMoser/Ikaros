package Program_14 

object Test {
sealed trait T_A[A]
case class CC_B[C]() extends T_A[C]
case class CC_C[D](a: T_A[D], b: D) extends T_A[D]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), _) => 0 
}
}
// This is not matched: (CC_A (CC_B Wildcard T_A) Wildcard (CC_B Wildcard T_A) T_A)