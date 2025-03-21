package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      Wildcard
//      (CC_A (CC_A Wildcard Wildcard Wildcard T_A) Wildcard Wildcard T_A)
//      T_A)