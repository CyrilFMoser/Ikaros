package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}