package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[Boolean]) extends T_B[(CC_A,CC_A)]
case class CC_D(a: CC_A, b: (CC_B,CC_B)) extends T_B[(CC_A,CC_A)]

val v_a: T_B[(CC_A,CC_A)] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_A(CC_A(_)), (CC_B(_),CC_B(_))) => 1 
  case CC_D(CC_A(CC_B(_)), (CC_B(_),CC_B(_))) => 2 
}
}