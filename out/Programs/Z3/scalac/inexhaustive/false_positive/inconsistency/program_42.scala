package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: Int, b: T_A[Byte, Char]) extends T_A[CC_A[(Boolean,Byte)], T_A[Byte, Byte]]

val v_a: T_A[CC_A[(Boolean,Byte)], T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: (CC_B Byte (CC_C Boolean Boolean) (T_A (CC_C Boolean Boolean) Byte))