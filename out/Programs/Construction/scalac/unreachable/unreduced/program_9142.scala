package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Boolean, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: (Boolean,(CC_C,T_A)), b: T_A) extends T_B[C, T_A]
case class CC_E[D](a: T_A, b: CC_B, c: D) extends T_B[D, T_A]
case class CC_F(a: T_A, b: T_B[T_B[CC_C, T_A], T_A], c: CC_D[CC_C]) extends T_B[T_B[(Char,(Int,Char)), T_A], T_A]

val v_a: T_B[T_B[(Char,(Int,Char)), T_A], T_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_, _, CC_D((_,_), _)) => 1 
  case CC_E(_, _, CC_E(_, _, _)) => 2 
  case CC_F(_, CC_D(_, _), CC_D(_, CC_A(_, _))) => 3 
  case CC_F(_, CC_D(_, _), CC_D(_, CC_B(_))) => 4 
  case CC_F(_, CC_D(_, _), CC_D(_, CC_C())) => 5 
  case CC_F(_, CC_E(_, _, CC_D(_, _)), CC_D(_, CC_A(_, _))) => 6 
  case CC_F(_, CC_E(_, _, CC_D(_, _)), CC_D(_, CC_B(_))) => 7 
  case CC_F(_, CC_E(_, _, CC_D(_, _)), CC_D(_, CC_C())) => 8 
  case CC_F(_, CC_E(_, _, CC_E(_, _, _)), CC_D(_, CC_B(_))) => 9 
  case CC_F(_, CC_E(_, _, CC_E(_, _, _)), CC_D(_, CC_C())) => 10 
}
}
// This is not matched: CC_F(_, CC_E(_, _, CC_E(_, _, _)), CC_D(_, CC_A(_, _)))