package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: CC_A, b: T_A[T_A[CC_A]], c: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(true) => 0 
  case CC_A(false) => 1 
  case CC_B(_, _, _) => 2 
}
}