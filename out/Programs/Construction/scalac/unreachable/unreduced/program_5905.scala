package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[Char, T_B], C]
case class CC_B[D](a: T_A[T_A[Char, T_B], CC_A[D]]) extends T_A[T_A[Char, T_B], D]
case class CC_C(a: CC_A[(T_B,Byte)]) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_A[Int, (T_B,Char)], b: T_A[T_A[Char, T_B], Boolean]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_C(CC_A())