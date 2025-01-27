package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(T_A,T_A)]) extends T_A
case class CC_B[B](a: CC_A) extends T_B[B]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_B(_))) => 0 
}
}