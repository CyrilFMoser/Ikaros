package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B) extends T_A[B]
case class CC_B() extends T_B
case class CC_C(a: T_A[T_A[T_B]]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}