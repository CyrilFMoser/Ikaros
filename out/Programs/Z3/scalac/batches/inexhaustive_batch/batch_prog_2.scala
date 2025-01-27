package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D, E](a: E) extends T_A[D, T_A[D, D]]
case class CC_C() extends T_B
case class CC_D(a: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_D(12) => 1 
}
}
// This is not matched: (CC_C T_B)