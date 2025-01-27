package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[B], c: (T_A[Boolean],T_A[Byte])) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A[CC_A[Byte]]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(_) => 1 
}
}