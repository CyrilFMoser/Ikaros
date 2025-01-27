package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[((T_B,T_B),Boolean), C]
case class CC_B(a: T_B, b: T_A[T_B, T_B], c: CC_A[T_A[T_B, Char]]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_B, b: T_B, c: CC_C) extends T_B

val v_a: T_A[((T_B,T_B),Boolean), Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _)) => 0 
  case CC_A(CC_C()) => 1 
}
}
// This is not matched: CC_A(CC_D(_, _, _))