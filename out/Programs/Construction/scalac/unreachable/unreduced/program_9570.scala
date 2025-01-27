package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Boolean, b: T_A[Boolean], c: T_A[Boolean]) extends T_A[Boolean]
case class CC_B() extends T_A[CC_A]
case class CC_C(a: T_A[CC_A]) extends T_A[CC_A]
case class CC_D(a: Char, b: T_A[T_A[CC_A]], c: T_A[CC_B]) extends T_B[CC_A]
case class CC_E(a: T_B[CC_A], b: CC_B) extends T_B[CC_A]
case class CC_F(a: (T_A[CC_A],CC_A), b: T_A[T_A[CC_A]]) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D('x', _, _) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E(CC_D(_, _, _), CC_B()) => 2 
  case CC_E(CC_E(CC_D(_, _, _), CC_B()), CC_B()) => 3 
  case CC_E(CC_E(CC_E(_, _), CC_B()), CC_B()) => 4 
  case CC_E(CC_E(CC_F(_, _), CC_B()), CC_B()) => 5 
  case CC_E(CC_F((_,_), _), CC_B()) => 6 
  case CC_F(_, _) => 7 
}
}