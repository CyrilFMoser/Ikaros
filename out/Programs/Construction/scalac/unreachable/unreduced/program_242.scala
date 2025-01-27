package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, Char],T_A), b: T_B[T_B[T_A, T_A], T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Int, b: T_B[CC_B, CC_B]) extends T_A
case class CC_D(a: Byte, b: T_B[(T_A,T_A), T_B[CC_A, CC_A]]) extends T_B[CC_A, CC_A]
case class CC_E[C](a: CC_B) extends T_B[(CC_A,(CC_D,Int)), C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}