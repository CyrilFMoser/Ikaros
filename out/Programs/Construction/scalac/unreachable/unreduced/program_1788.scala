package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_B[Int],T_A[Int]), b: T_A[C]) extends T_A[C]
case class CC_B(a: T_A[CC_A[Boolean]]) extends T_A[T_A[(Byte,Char)]]
case class CC_C() extends T_B[CC_A[T_A[CC_B]]]
case class CC_D() extends T_B[CC_A[T_A[CC_B]]]

val v_a: T_A[T_A[(Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_B(_)) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_A((_,_), CC_A(_, _))