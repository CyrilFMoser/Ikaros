package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: T_A[B], c: T_A[Int]) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_B, b: T_A[T_B], c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: Char) extends T_A[T_A[T_A[T_B]]]
case class CC_D() extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_D(), _, CC_D()) => 0 
  case CC_C('x') => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A(_, _, _)