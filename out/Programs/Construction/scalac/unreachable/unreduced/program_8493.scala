package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B, T_B], T_B]) extends T_A[T_B, T_A[T_B, T_B]]
case class CC_B(a: T_A[T_B, T_A[T_B, T_B]], b: Byte) extends T_B
case class CC_C(a: (T_A[Char, CC_A],T_A[CC_B, CC_A])) extends T_B
case class CC_D(a: Char, b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
  case CC_B(_, _) => 1 
  case CC_C((_,_)) => 2 
  case CC_D('x', _) => 3 
}
}
// This is not matched: CC_D(_, _)