package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[Int], Byte]
case class CC_C[E, D](a: D, b: T_B[D]) extends T_A[E, D]
case class CC_D() extends T_B[T_A[Byte, CC_A]]

val v_a: T_A[T_B[T_A[Byte, CC_A]], Byte] = null
val v_b: Int = v_a match{
  case CC_C(0, _) => 0 
}
}
// This is not matched: (CC_E Char (T_B Char))