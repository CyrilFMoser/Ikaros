package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]], b: Char, c: T_B[Boolean]) extends T_A[T_A[T_B[Boolean]]]
case class CC_B() extends T_A[T_A[T_B[Boolean]]]

val v_a: T_A[T_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}