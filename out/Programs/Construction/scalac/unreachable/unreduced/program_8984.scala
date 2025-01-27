package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[Byte]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: (T_A[CC_A],CC_A), b: CC_B, c: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B() => 2 
  case CC_C(_, _, _) => 3 
}
}