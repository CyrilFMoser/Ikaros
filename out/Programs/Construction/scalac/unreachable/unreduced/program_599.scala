package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[((Int,Char),Boolean)]]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[T_A[((Int,Char),Boolean)]]
case class CC_C(a: (CC_B,CC_A), b: Char, c: CC_B) extends T_A[T_A[((Int,Char),Boolean)]]

val v_a: T_A[T_A[((Int,Char),Boolean)]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A()