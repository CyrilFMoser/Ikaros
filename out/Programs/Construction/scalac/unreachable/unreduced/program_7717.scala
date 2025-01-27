package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Char], T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: T_B[Char, Char]) extends T_A
case class CC_D(a: T_A, b: Boolean, c: Boolean) extends T_B[CC_C, CC_A]
case class CC_E(a: (CC_D,T_A)) extends T_B[CC_C, CC_A]
case class CC_F(a: Int, b: T_B[CC_C, CC_A], c: CC_C) extends T_B[CC_C, CC_A]

val v_a: T_B[CC_C, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E((CC_D(_, _, _),CC_A(_))) => 1 
  case CC_E((CC_D(_, _, _),CC_B())) => 2 
  case CC_E((CC_D(_, _, _),CC_C(_, _))) => 3 
  case CC_F(_, CC_D(_, _, _), _) => 4 
  case CC_F(_, CC_F(_, CC_D(_, _, _), CC_C(_, _)), _) => 5 
  case CC_F(_, CC_F(_, CC_E(_), CC_C(_, _)), _) => 6 
  case CC_F(_, CC_F(_, CC_F(_, _, _), CC_C(_, _)), _) => 7 
}
}
// This is not matched: CC_F(_, CC_E((_,_)), _)