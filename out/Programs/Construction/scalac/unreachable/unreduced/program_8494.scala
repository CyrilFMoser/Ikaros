package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Boolean]) extends T_A
case class CC_B(a: (T_B[(Boolean,Byte), (Char,Boolean)],CC_A)) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: CC_B, b: C, c: C) extends T_B[C, CC_A]
case class CC_E[D]() extends T_B[D, CC_A]
case class CC_F[E](a: CC_D[E], b: T_B[E, CC_A]) extends T_B[E, CC_A]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E() => 1 
  case CC_F(CC_D(CC_B(_), CC_A(_), _), CC_E()) => 2 
  case CC_F(CC_D(CC_B(_), CC_A(_), _), CC_F(_, _)) => 3 
}
}
// This is not matched: CC_F(CC_D(CC_B(_), CC_A(_), _), CC_D(_, _, _))