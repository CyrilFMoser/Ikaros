package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[T_B[Boolean, Boolean]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C[D](a: Int, b: D, c: T_B[D, D]) extends T_A[D]
case class CC_D[E](a: T_A[E], b: T_A[E]) extends T_B[E, T_A[E]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C(_, _, _)) => 1 
  case CC_C(_, CC_C(_, _, _), _) => 2 
}
}