package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: T_A[T_B[(Int,Boolean)]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: CC_A, b: CC_A, c: T_B[CC_A]) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _, _) => 2 
}
}