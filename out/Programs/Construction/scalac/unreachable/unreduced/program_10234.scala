package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_B) extends T_A[Boolean, C]
case class CC_B(a: T_A[Boolean, CC_A[Char]], b: T_A[Boolean, (T_B,T_B)]) extends T_A[Boolean, CC_A[CC_A[T_B]]]
case class CC_C(a: CC_A[T_A[Boolean, T_B]]) extends T_B
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: Char, b: Boolean, c: CC_A[T_A[CC_B, CC_C]]) extends T_B

val v_a: T_A[Boolean, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_A(_, _)), CC_C(CC_A(_, _))) => 0 
  case CC_A(CC_C(CC_A(_, _)), CC_D(CC_C(_))) => 1 
  case CC_A(CC_D(CC_C(_)), CC_C(CC_A(_, _))) => 2 
  case CC_A(CC_D(CC_C(_)), CC_D(CC_C(_))) => 3 
  case CC_A(CC_D(CC_C(_)), CC_E(_, _, CC_A(_, _))) => 4 
  case CC_A(CC_E(_, _, CC_A(_, _)), CC_C(CC_A(_, _))) => 5 
  case CC_A(CC_E(_, _, CC_A(_, _)), CC_D(CC_C(_))) => 6 
  case CC_A(CC_E(_, _, CC_A(_, _)), CC_E(_, _, CC_A(_, _))) => 7 
}
}
// This is not matched: CC_A(CC_C(CC_A(_, _)), CC_E(_, _, CC_A(_, _)))