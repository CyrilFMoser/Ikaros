package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (Byte,Boolean), b: T_B[Byte, Char]) extends T_A[T_A[Byte]]
case class CC_C[D]() extends T_B[D, T_B[D, CC_A]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A((0,_), _) => 0 
}
}
// This is not matched: (CC_A Char Byte Boolean Wildcard Wildcard Wildcard (T_A Char Byte))