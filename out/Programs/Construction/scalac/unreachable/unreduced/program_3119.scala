package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: Boolean, b: CC_A) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: T_A[Int], b: Boolean) extends T_A[T_A[T_A[Boolean]]]
case class CC_D[D, E](a: Boolean, b: T_B[E, E]) extends T_B[D, T_A[D]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_C(_, _) => 2 
}
}