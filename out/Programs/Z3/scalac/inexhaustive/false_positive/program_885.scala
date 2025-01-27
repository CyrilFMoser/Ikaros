package Program_31 

object Test {
sealed trait T_A[A]
case class CC_C[C](a: C) extends T_A[C]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_A Wildcard (Tuple (CC_B T_A) (CC_B T_A)) Wildcard T_A)