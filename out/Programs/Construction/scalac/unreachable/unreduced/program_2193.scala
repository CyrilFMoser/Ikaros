package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int) extends T_A
case class CC_B(a: Byte, b: T_B[T_B[T_A, T_A], T_A]) extends T_A
case class CC_C(a: (CC_B,T_B[CC_B, CC_A]), b: CC_A) extends T_A
case class CC_D[C, D](a: D) extends T_B[C, CC_A]
case class CC_E(a: CC_D[CC_A, CC_A], b: CC_B, c: CC_C) extends T_B[CC_A, CC_A]
case class CC_F[E](a: E, b: T_A) extends T_B[E, CC_A]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F(CC_A(_), CC_A(_)) => 2 
  case CC_F(CC_A(_), CC_B(0, _)) => 3 
  case CC_F(CC_A(_), CC_B(_, _)) => 4 
  case CC_F(CC_A(_), CC_C((_,_), CC_A(_))) => 5 
}
}