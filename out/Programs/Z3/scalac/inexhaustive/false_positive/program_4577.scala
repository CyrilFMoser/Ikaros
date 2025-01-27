package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B, b: T_A[D, C]) extends T_A[C, D]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: CC_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_E(), _) => 0 
}
}
// This is not matched: (CC_A Int
//      Byte
//      Wildcard
//      (CC_D Wildcard (CC_C T_B Wildcard (T_A T_B (T_A T_B T_B))) Wildcard T_B)
//      Wildcard
//      (T_A Int Byte))