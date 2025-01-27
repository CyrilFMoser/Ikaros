package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[(T_A[Boolean],T_A[Int])]
case class CC_B[B](a: T_A[B], b: (CC_A,(CC_A,CC_A)), c: Boolean) extends T_A[(T_A[Boolean],T_A[Int])]
case class CC_C(a: (CC_B[(Byte,Boolean)],CC_A), b: Int, c: T_A[CC_B[CC_A]]) extends T_A[(T_A[Boolean],T_A[Int])]

val v_a: T_A[(T_A[Boolean],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (CC_A(_),(_,_)), _) => 1 
  case CC_C((CC_B(_, _, _),CC_A(_)), _, _) => 2 
}
}