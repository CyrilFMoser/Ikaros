package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: T_A[T_A[T_B]]) extends T_A[Boolean]
case class CC_B(a: T_A[Boolean]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}