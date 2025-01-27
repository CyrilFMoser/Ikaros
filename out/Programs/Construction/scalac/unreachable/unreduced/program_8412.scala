package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, C]) extends T_A[(T_A[(Char,Boolean), T_B],T_B), C]
case class CC_B(a: Boolean, b: T_B, c: CC_A[T_A[T_B, T_B]]) extends T_B
case class CC_C(a: CC_B) extends T_B
case class CC_D(a: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _, _)) => 0 
  case CC_C(CC_B(true, _, _)) => 1 
  case CC_C(CC_B(false, _, _)) => 2 
  case CC_D(CC_C(CC_B(_, _, _))) => 3 
}
}