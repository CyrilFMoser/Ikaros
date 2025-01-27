package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: Char, c: T_A[C, C]) extends T_A[C, T_B]
case class CC_B[D](a: Char, b: CC_A[(T_B,T_B)], c: T_A[D, T_B]) extends T_A[D, T_B]
case class CC_C(a: ((T_B,T_B),T_A[T_B, Boolean]), b: Byte) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_C((_,_), _)) => 1 
  case CC_E(CC_D()) => 2 
  case CC_E(CC_E(CC_C(_, _))) => 3 
  case CC_E(CC_E(CC_D())) => 4 
  case CC_E(CC_E(CC_E(_))) => 5 
}
}
// This is not matched: CC_C(_, _)