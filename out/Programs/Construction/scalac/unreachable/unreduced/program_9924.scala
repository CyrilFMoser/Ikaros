package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: T_A[C, C], c: C) extends T_A[C, T_B]
case class CC_B[D](a: Char, b: CC_A[D]) extends T_A[D, T_B]
case class CC_C(a: CC_B[(T_B,Byte)], b: ((T_B,T_B),T_B), c: T_A[T_A[T_B, T_B], CC_A[T_B]]) extends T_B
case class CC_D(a: T_A[T_A[CC_C, Int], T_B]) extends T_B

val v_a: T_A[Int, T_B] = null
val v_b: Int = v_a match{
  case CC_A(true, _, _) => 0 
  case CC_A(false, _, _) => 1 
  case CC_B(_, _) => 2 
}
}