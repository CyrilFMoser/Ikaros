package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: (CC_A,T_B[CC_A]), b: T_A, c: T_B[T_A]) extends T_B[T_A]
case class CC_C(a: CC_B, b: Char, c: Boolean) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_),_), CC_A(CC_A(_)), CC_C(_, _, _)) => 0 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), 'x', _) => 1 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), 'x', _) => 2 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _, _) => 3 
  case CC_C(CC_B(_, _, CC_C(_, _, _)), _, _) => 4 
}
}
// This is not matched: CC_B((CC_A(_),_), CC_A(CC_A(_)), CC_B(_, CC_A(_), _))