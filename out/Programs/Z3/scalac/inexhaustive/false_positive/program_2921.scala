package Program_12 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: T_A[C], b: T_A[C]) extends T_A[C]
case class CC_C[D]() extends T_A[D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
}
}
// This is not matched: (CC_C Wildcard (T_A (T_A Boolean)))