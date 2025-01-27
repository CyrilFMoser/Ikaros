package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, C]) extends T_A[Int, C]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_F (Tuple Byte Int)
//      (CC_B Int Boolean Boolean (T_A Boolean Boolean) Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (Tuple Byte Int)
//           (CC_B Int Boolean Boolean (T_A Boolean Boolean) Boolean)))