package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_B(a: T_A[(CC_A,CC_A), CC_A], b: Boolean, c: ((CC_A,CC_A),(T_B,T_B))) extends T_A[T_B, T_B]
case class CC_C() extends T_A[T_B, T_B]

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_C()) => 1 
  case CC_B(_, _, ((_,_),(_,_))) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_A(CC_B(_, _, _))