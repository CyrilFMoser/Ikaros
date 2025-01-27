package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_A[T_A[T_B]], b: T_A[CC_A], c: T_A[(T_B,CC_A)]) extends T_A[T_B]
case class CC_D(a: T_A[T_A[Int]], b: ((Int,CC_C),((Boolean,Char),CC_C)), c: T_B) extends T_B
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, ((_,_),(_,_)), _) => 0 
  case CC_F() => 1 
}
}
// This is not matched: CC_E()