package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Byte, T_A[Char, Boolean]]) extends T_A[(T_A[Char, Boolean],Boolean), T_A[Int, T_A[Byte, Byte]]]
case class CC_B() extends T_A[(T_A[Char, Boolean],Boolean), T_A[Int, T_A[Byte, Byte]]]
case class CC_C(a: T_A[Boolean, T_A[CC_B, CC_B]]) extends T_A[(T_A[Char, Boolean],Boolean), T_A[Int, T_A[Byte, Byte]]]

val v_a: T_A[(T_A[Char, Boolean],Boolean), T_A[Int, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_)