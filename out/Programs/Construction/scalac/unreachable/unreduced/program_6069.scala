package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[Boolean, T_A]]) extends T_A
case class CC_B(a: (T_A,T_B[CC_A, CC_A])) extends T_A
case class CC_C(a: Byte, b: CC_B, c: Int) extends T_A
case class CC_D[C](a: C) extends T_B[C, (CC_A,CC_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_B(_),_)) => 1 
  case CC_B((CC_C(_, _, _),_)) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_B((CC_A(_),_))