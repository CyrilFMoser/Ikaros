package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[(T_A[Int, Boolean],T_A[Boolean, Int]), C]
case class CC_B[D](a: CC_A[D], b: CC_A[D]) extends T_A[(T_A[Int, Boolean],T_A[Boolean, Int]), D]
case class CC_C() extends T_A[(T_A[Int, Boolean],T_A[Boolean, Int]), Boolean]

val v_a: T_A[(T_A[Int, Boolean],T_A[Boolean, Int]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)