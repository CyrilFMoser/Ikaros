package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Byte, Byte], (Byte,Int)]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: (T_A[CC_A],CC_B), b: T_A[CC_B]) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C((_,CC_B()), _) => 2 
}
}