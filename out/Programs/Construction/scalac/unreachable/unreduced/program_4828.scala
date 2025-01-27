package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_B(a: (CC_A,T_A[CC_A]), b: Boolean, c: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: Int) extends T_A[T_B]
case class CC_D(a: (CC_A,CC_B), b: T_A[T_B], c: Boolean) extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_),_), true, CC_A(_)) => 0 
  case CC_B((CC_A(_),_), false, CC_A(_)) => 1 
  case CC_B((CC_A(_),_), true, CC_B(_, _, CC_A(_))) => 2 
  case CC_B((CC_A(_),_), false, CC_B(_, _, CC_A(_))) => 3 
  case CC_B((CC_A(_),_), true, CC_B(_, _, CC_B(_, _, _))) => 4 
  case CC_B((CC_A(_),_), false, CC_B(_, _, CC_B(_, _, _))) => 5 
  case CC_B((CC_A(_),_), true, CC_B(_, _, CC_C(_))) => 6 
  case CC_B((CC_A(_),_), false, CC_B(_, _, CC_C(_))) => 7 
  case CC_B((CC_A(_),_), true, CC_C(_)) => 8 
  case CC_B((CC_A(_),_), false, CC_C(_)) => 9 
  case CC_C(_) => 10 
}
}
// This is not matched: CC_A(_)