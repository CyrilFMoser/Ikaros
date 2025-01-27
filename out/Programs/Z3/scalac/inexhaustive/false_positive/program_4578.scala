package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Char]) extends T_A[C, Char]
case class CC_B[D]() extends T_A[D, Char]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: (CC_A Int
//      Byte
//      Wildcard
//      (CC_D Wildcard (CC_C T_B Wildcard (T_A T_B (T_A T_B T_B))) Wildcard T_B)
//      Wildcard
//      (T_A Int Byte))