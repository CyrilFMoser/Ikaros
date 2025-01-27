package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: T_A[T_A[Boolean]], c: T_A[(Byte,Byte)]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: Char) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: T_A[CC_B]) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B('x') => 1 
  case CC_B(_) => 2 
  case CC_C(_) => 3 
}
}