package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Int,Byte)]], b: T_A[Int], c: ((Byte,Boolean),T_A[Boolean])) extends T_A[(T_A[Boolean],T_A[Boolean])]
case class CC_B(a: CC_A, b: (T_A[CC_A],CC_A), c: CC_A) extends T_A[(T_A[Boolean],T_A[Boolean])]
case class CC_C(a: Byte, b: CC_B, c: CC_B) extends T_A[(T_A[Boolean],T_A[Boolean])]

val v_a: T_A[(T_A[Boolean],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, ((_,_),_)) => 0 
  case CC_B(CC_A(_, _, (_,_)), (_,CC_A(_, _, _)), CC_A(_, _, (_,_))) => 1 
  case CC_C(_, _, _) => 2 
}
}