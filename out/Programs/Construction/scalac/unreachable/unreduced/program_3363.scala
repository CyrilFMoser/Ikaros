package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: (CC_A,T_A[CC_A])) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_B, b: T_A[CC_A], c: CC_A) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_A(_),_)) => 1 
  case CC_C(CC_B(_), _, CC_A(_)) => 2 
}
}