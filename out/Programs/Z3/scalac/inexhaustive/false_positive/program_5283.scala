package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C(a: (T_B,T_B), b: T_B, c: T_A[Int]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_A (CC_A (CC_B Wildcard Wildcard Byte T_A)
//            Boolean
//            (CC_B Wildcard Char Byte T_A)
//            T_A)
//      Boolean
//      Wildcard
//      T_A)