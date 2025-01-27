package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: T_A[T_B]) extends T_A[T_A[(Boolean,Byte)]]

val v_a: T_A[T_A[(Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_D (Tuple Wildcard (CC_C T_B)) T_B)