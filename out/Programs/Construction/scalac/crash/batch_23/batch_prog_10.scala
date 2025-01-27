package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: Boolean, c: T_A[B]) extends T_A[B]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, true, _) => 0 
  case CC_A(_, false, _) => 1 
}
}