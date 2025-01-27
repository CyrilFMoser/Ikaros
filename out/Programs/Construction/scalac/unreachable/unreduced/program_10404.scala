package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: Boolean) extends T_A[T_A[(Boolean,Char)]]
case class CC_B(a: CC_A) extends T_A[T_A[(Boolean,Char)]]
case class CC_C(a: (CC_B,(CC_A,CC_B))) extends T_A[T_A[(Boolean,Char)]]

val v_a: T_A[T_A[(Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, true)) => 1 
  case CC_B(CC_A(_, false)) => 2 
  case CC_C((CC_B(_),(_,_))) => 3 
}
}