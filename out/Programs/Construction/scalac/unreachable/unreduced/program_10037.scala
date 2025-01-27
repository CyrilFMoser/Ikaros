package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_A[Boolean], c: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_B(a: Int, b: Char, c: T_B) extends T_A[T_A[T_B]]
case class CC_C(a: (CC_B,Int)) extends T_A[T_A[T_B]]
case class CC_D(a: Char, b: T_B) extends T_B
case class CC_E(a: Boolean, b: CC_C) extends T_B
case class CC_F(a: (Byte,CC_A)) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, _) => 0 
  case CC_A(CC_A(_, _, CC_B(_, _, _)), _, _) => 1 
  case CC_A(CC_A(_, _, CC_C(_)), _, _) => 2 
  case CC_A(CC_B(_, _, _), _, _) => 3 
  case CC_A(CC_C(_), _, _) => 4 
  case CC_B(12, 'x', CC_D('x', CC_D(_, _))) => 5 
  case CC_B(_, 'x', CC_D('x', CC_D(_, _))) => 6 
  case CC_B(12, 'x', CC_D(_, CC_D(_, _))) => 7 
  case CC_B(_, 'x', CC_D(_, CC_D(_, _))) => 8 
  case CC_B(12, 'x', CC_D('x', CC_E(_, _))) => 9 
  case CC_B(_, 'x', CC_D('x', CC_E(_, _))) => 10 
  case CC_B(12, 'x', CC_D(_, CC_E(_, _))) => 11 
  case CC_B(_, 'x', CC_D(_, CC_E(_, _))) => 12 
  case CC_B(12, 'x', CC_D('x', CC_F(_))) => 13 
  case CC_B(_, 'x', CC_D('x', CC_F(_))) => 14 
  case CC_B(12, 'x', CC_D(_, CC_F(_))) => 15 
  case CC_B(_, 'x', CC_D(_, CC_F(_))) => 16 
  case CC_B(12, 'x', CC_E(_, CC_C(_))) => 17 
  case CC_B(_, 'x', CC_E(_, CC_C(_))) => 18 
  case CC_B(12, 'x', CC_F((_,_))) => 19 
  case CC_B(_, 'x', CC_F((_,_))) => 20 
  case CC_B(12, _, CC_D('x', CC_D(_, _))) => 21 
  case CC_B(_, _, CC_D('x', CC_D(_, _))) => 22 
  case CC_B(12, _, CC_D(_, CC_D(_, _))) => 23 
  case CC_B(_, _, CC_D(_, CC_D(_, _))) => 24 
  case CC_B(12, _, CC_D('x', CC_E(_, _))) => 25 
  case CC_B(_, _, CC_D('x', CC_E(_, _))) => 26 
  case CC_B(12, _, CC_D(_, CC_E(_, _))) => 27 
  case CC_B(12, _, CC_D('x', CC_F(_))) => 28 
  case CC_B(_, _, CC_D('x', CC_F(_))) => 29 
  case CC_B(12, _, CC_D(_, CC_F(_))) => 30 
  case CC_B(_, _, CC_D(_, CC_F(_))) => 31 
  case CC_B(12, _, CC_E(_, CC_C(_))) => 32 
  case CC_B(_, _, CC_E(_, CC_C(_))) => 33 
  case CC_B(12, _, CC_F((_,_))) => 34 
  case CC_B(_, _, CC_F((_,_))) => 35 
  case CC_C((CC_B(_, _, _),_)) => 36 
}
}
// This is not matched: CC_B(_, _, CC_D(_, CC_E(_, _)))