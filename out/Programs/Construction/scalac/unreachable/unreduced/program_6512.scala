package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Boolean,Byte)], b: T_A[Byte], c: Boolean) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[T_A[CC_A]], b: CC_A, c: T_A[Boolean]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C() extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}