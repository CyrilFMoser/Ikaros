package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Char]], b: T_B[T_B[Boolean]]) extends T_A[(T_A[Boolean],T_B[Boolean])]
case class CC_B(a: T_A[CC_A], b: (CC_A,(CC_A,CC_A)), c: CC_A) extends T_A[(T_A[Boolean],T_B[Boolean])]
case class CC_C() extends T_A[(T_A[Boolean],T_B[Boolean])]

val v_a: T_A[(T_A[Boolean],T_B[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, (CC_A(_, _),(_,_)), _) => 1 
  case CC_C() => 2 
}
}