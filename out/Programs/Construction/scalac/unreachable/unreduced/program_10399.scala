package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[(T_B,Char)]
case class CC_B(a: CC_A) extends T_A[(T_B,Char)]
case class CC_C(a: Boolean, b: T_B) extends T_A[CC_A]
case class CC_D(a: (T_B,CC_A), b: Char) extends T_B
case class CC_E(a: T_A[CC_A], b: CC_D, c: CC_A) extends T_B
case class CC_F(a: CC_B, b: Int, c: T_A[T_B]) extends T_B

val v_a: T_A[(T_B,Char)] = null
val v_b: Int = v_a match{
  case CC_A(CC_D((_,_), _)) => 0 
  case CC_A(CC_F(CC_B(_), _, _)) => 1 
  case CC_B(CC_A(CC_D(_, _))) => 2 
  case CC_B(CC_A(CC_E(_, _, _))) => 3 
  case CC_B(CC_A(CC_F(_, _, _))) => 4 
}
}
// This is not matched: CC_A(CC_E(_, _, CC_A(_)))