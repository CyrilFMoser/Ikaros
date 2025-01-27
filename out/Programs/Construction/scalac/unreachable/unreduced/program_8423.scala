package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[T_B],T_B), b: T_A[T_B]) extends T_A[T_A[T_B]]
case class CC_B(a: (Byte,Byte), b: (Int,T_A[CC_A])) extends T_A[T_A[T_B]]
case class CC_C() extends T_A[T_A[T_B]]
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: CC_D, b: (Byte,CC_D)) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,_), _) => 1 
}
}
// This is not matched: CC_C()