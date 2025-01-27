package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[(CC_A,CC_A)], b: CC_A) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_B, b: T_A[(CC_A,(Char,Char))]) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_B(_, _), _) => 2 
}
}