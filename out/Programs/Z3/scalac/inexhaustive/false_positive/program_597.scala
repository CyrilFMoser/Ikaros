package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Byte, T_B], b: (Byte,Byte), c: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_C() extends T_A[T_B, T_B]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))