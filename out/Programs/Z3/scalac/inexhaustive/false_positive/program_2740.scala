package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int) extends T_A[C]
case class CC_D() extends T_B[T_B[Byte]]

val v_a: CC_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B (Tuple (CC_B Wildcard Wildcard T_A) Wildcard)
//      (CC_B Wildcard (CC_C Wildcard T_A) T_A)
//      T_A)