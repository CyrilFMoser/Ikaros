package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Boolean, b: Boolean, c: T_B) extends T_A[T_A[T_B, T_B], (T_A[T_B, T_B],T_A[T_B, T_B])]
case class CC_B(a: CC_A, b: CC_A, c: T_A[T_A[CC_A, CC_A], T_A[T_B, CC_A]]) extends T_A[T_A[T_B, T_B], (T_A[T_B, T_B],T_A[T_B, T_B])]
case class CC_C(a: Int, b: T_B) extends T_A[T_A[T_B, T_B], (T_A[T_B, T_B],T_A[T_B, T_B])]
case class CC_D(a: Char) extends T_B
case class CC_E(a: CC_A) extends T_B
case class CC_F() extends T_B

val v_a: T_A[T_A[T_B, T_B], (T_A[T_B, T_B],T_A[T_B, T_B])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D('x')) => 0 
  case CC_A(_, _, CC_D(_)) => 1 
  case CC_A(_, _, CC_E(CC_A(_, _, _))) => 2 
  case CC_B(CC_A(_, _, CC_D(_)), _, _) => 3 
  case CC_B(CC_A(_, _, CC_E(_)), _, _) => 4 
  case CC_B(CC_A(_, _, CC_F()), _, _) => 5 
  case CC_C(_, CC_D(_)) => 6 
  case CC_C(_, CC_E(_)) => 7 
  case CC_C(_, CC_F()) => 8 
}
}
// This is not matched: CC_A(_, _, CC_F())