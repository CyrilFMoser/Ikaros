package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Int,(Int,Byte)), b: B, c: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_B (CC_A T_A T_A)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (CC_A T_A T_A) (CC_A T_A T_A)))