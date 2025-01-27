package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: C, b: T_A[Char]) extends T_A[T_A[C]]
case class CC_B(a: CC_A[Byte]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(0, _)) => 0 
}
}
// This is not matched: (CC_B (T_A Boolean))