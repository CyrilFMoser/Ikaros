package Program_61 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Byte, C], b: T_A[C, C]) extends T_A[Byte, C]
case class CC_B[D]() extends T_A[Byte, D]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(CC_B(), _), _) => 1 
}
}
// This is not matched: (CC_B (T_A (CC_B Byte Boolean (T_A Boolean)))
//      (CC_C (T_A (CC_B Byte Boolean (T_A Boolean))))
//      (T_A (T_A (CC_B Byte Boolean (T_A Boolean)))))