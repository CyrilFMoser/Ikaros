package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: Int) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: CC_A, b: CC_A, c: T_A[Char]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: (CC_A,Boolean), b: Byte) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}