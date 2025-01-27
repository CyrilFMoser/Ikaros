package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[(Boolean,T_A[T_B, T_B]), C]
case class CC_B(a: T_A[CC_A[T_B], T_A[T_B, T_B]]) extends T_B
case class CC_C(a: Int, b: CC_B, c: T_B) extends T_B
case class CC_D() extends T_B

val v_a: CC_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_)) => 0 
  case CC_A(CC_C(_, _, CC_B(_))) => 1 
  case CC_A(CC_C(_, _, CC_C(_, _, _))) => 2 
  case CC_A(CC_D()) => 3 
}
}
// This is not matched: CC_A(CC_C(_, _, CC_D()))