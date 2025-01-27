package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[(Byte,Byte)]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard (T_A (T_A Char Char) (T_A Boolean Int)))