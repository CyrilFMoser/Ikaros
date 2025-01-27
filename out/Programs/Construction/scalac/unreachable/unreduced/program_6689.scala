package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Byte,Byte)]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: Char) extends T_A[T_A[T_A[Boolean]]]
case class CC_C() extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B('x') => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: CC_C()