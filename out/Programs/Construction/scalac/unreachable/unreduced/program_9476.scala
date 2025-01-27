package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[(T_B,T_B), C]
case class CC_B(a: T_A[(T_B,T_B), CC_A[Byte]], b: CC_A[T_B]) extends T_A[(T_B,T_B), T_B]
case class CC_C() extends T_A[(T_B,T_B), T_B]
case class CC_D(a: CC_A[CC_C], b: Char, c: (CC_B,T_A[CC_B, CC_C])) extends T_B
case class CC_E(a: Boolean, b: (T_B,CC_B), c: (CC_C,(CC_B,CC_D))) extends T_B
case class CC_F(a: T_A[(T_B,T_B), T_B], b: CC_C) extends T_B

val v_a: T_A[(T_B,T_B), T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_A(_), _, (_,_))) => 0 
  case CC_A(CC_E(_, _, _)) => 1 
  case CC_A(CC_F(CC_A(_), CC_C())) => 2 
  case CC_A(CC_F(CC_B(_, _), CC_C())) => 3 
  case CC_A(CC_F(CC_C(), CC_C())) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_B(_, _)