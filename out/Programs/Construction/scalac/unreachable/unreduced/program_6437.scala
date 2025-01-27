package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_B,T_A[T_B, T_B])) extends T_A[T_B, T_B]
case class CC_B(a: Char, b: Char, c: (CC_A,T_A[CC_A, (Byte,Char)])) extends T_A[T_B, T_B]
case class CC_C(a: Char) extends T_A[T_B, T_B]

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_))) => 0 
  case CC_A((_,CC_C(_))) => 1 
  case CC_B(_, _, (CC_A(_),_)) => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: CC_A((_,CC_B(_, _, _)))