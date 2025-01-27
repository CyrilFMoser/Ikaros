package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[(Byte,Boolean)]]
case class CC_B(a: Byte, b: T_A[CC_A]) extends T_A[T_B[CC_A, CC_A]]

val v_a: T_A[T_B[CC_A, CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(0, _) => 0 
}
}
// This is not matched: (CC_C Char Boolean Wildcard (T_B Char Boolean))