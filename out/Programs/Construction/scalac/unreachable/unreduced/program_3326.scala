package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: Char) extends T_A[T_A[Boolean]]
case class CC_B(a: CC_A, b: T_A[T_A[CC_A]]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _) => 2 
}
}