package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B, T_B], (Byte,T_B)], b: T_A[T_B, T_A[T_B, T_B]]) extends T_A[Char, T_A[T_A[T_B, T_B], T_A[T_B, T_B]]]
case class CC_B() extends T_B
case class CC_C(a: Int, b: T_A[Byte, T_A[Char, Char]]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(12, _) => 1 
  case CC_C(_, _) => 2 
  case CC_D() => 3 
}
}