package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Char]], b: T_B[T_A[Boolean]]) extends T_A[T_B[T_B[Int]]]
case class CC_B(a: T_A[Char]) extends T_A[T_B[T_B[Int]]]
case class CC_C(a: Char) extends T_A[T_B[T_B[Int]]]

val v_a: T_A[T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C('x') => 2 
  case CC_C(_) => 3 
}
}