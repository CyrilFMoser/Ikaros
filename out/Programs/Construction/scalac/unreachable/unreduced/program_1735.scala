package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean]) extends T_A[T_A[T_A[Int]]]
case class CC_B() extends T_A[T_A[T_A[Int]]]
case class CC_C(a: Char) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C('x') => 2 
  case CC_C(_) => 3 
}
}