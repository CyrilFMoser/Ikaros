package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D) extends T_A[D, T_A[D, D]]
case class CC_C() extends T_A[CC_B[CC_B[Boolean]], T_A[CC_B[CC_B[Boolean]], CC_B[CC_B[Boolean]]]]

val v_a: T_A[CC_B[CC_B[Boolean]], T_A[CC_B[CC_B[Boolean]], CC_B[CC_B[Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(CC_B(CC_B(_)))