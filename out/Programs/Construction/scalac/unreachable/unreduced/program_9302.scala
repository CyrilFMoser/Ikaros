package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: Byte, b: (((Int,Int),T_B),T_A[CC_A]), c: T_A[T_B]) extends T_A[T_B]
case class CC_C() extends T_A[T_B]
case class CC_D(a: T_B, b: CC_B, c: (CC_C,CC_A)) extends T_B
case class CC_E(a: T_B, b: CC_C) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_B(_, ((_,_),_), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _)