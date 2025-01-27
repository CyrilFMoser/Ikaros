package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Int) extends T_A[D, C]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_D Int (CC_C T_A) Int (T_B Int (CC_C T_A)))