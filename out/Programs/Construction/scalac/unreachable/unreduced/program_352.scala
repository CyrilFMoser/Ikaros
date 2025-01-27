package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Boolean]], c: (T_A[Byte],T_A[Byte])) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: (CC_A,CC_A), b: CC_A, c: CC_A) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_A, b: T_A[T_A[CC_B]]) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_, _, _), _) => 2 
}
}