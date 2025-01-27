package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D](a: T_A[D, D], b: (T_B,T_B)) extends T_A[D, T_A[D, T_B]]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,CC_D())) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)