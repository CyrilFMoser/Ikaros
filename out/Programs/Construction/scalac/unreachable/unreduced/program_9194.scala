package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int) extends T_A[C]
case class CC_B(a: Boolean) extends T_B[CC_A[T_A[Byte]]]
case class CC_C(a: (CC_B,T_B[CC_B])) extends T_B[CC_A[T_A[Byte]]]
case class CC_D(a: Byte) extends T_B[CC_A[T_A[Byte]]]

val v_a: T_B[CC_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_C((CC_B(_),_)) => 0 
  case CC_D(0) => 1 
  case CC_D(_) => 2 
}
}
// This is not matched: CC_B(_)