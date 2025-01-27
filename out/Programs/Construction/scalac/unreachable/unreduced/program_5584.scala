package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: (CC_A,T_A), b: T_B[CC_A]) extends T_B[T_B[(T_A,T_A)]]
case class CC_D[B]() extends T_B[T_B[(T_A,T_A)]]

val v_a: T_B[T_B[(T_A,T_A)]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D() => 1 
}
}