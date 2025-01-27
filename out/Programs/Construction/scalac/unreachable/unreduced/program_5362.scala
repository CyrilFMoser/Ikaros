package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: Char, c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: CC_A, b: (T_B,Char), c: T_A[(Byte,CC_A)]) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: T_B, b: T_A[(Byte,T_B)]) extends T_A[T_A[T_A[T_B]]]
case class CC_D[B]() extends T_B
case class CC_E(a: CC_C, b: CC_C, c: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_C(CC_E(_, _, _), _), _) => 1 
}
}
// This is not matched: CC_E(_, CC_C(CC_D(), _), _)