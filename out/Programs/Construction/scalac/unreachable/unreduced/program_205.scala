package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[T_B[Boolean]]]
case class CC_B[E](a: Int, b: T_A[E, E]) extends T_A[E, T_B[T_B[Boolean]]]

val v_a: T_A[Int, T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}