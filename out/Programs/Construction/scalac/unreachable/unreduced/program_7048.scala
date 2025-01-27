package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_A, b: CC_B) extends T_A
case class CC_D(a: (CC_B,T_B[CC_B])) extends T_B[CC_B]
case class CC_E(a: CC_A, b: T_B[CC_B]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D((CC_B(_),CC_D(_))) => 0 
  case CC_D((CC_B(_),CC_E(_, _))) => 1 
  case CC_E(CC_A(_), CC_D((_,_))) => 2 
  case CC_E(CC_A(_), CC_E(CC_A(_), CC_D(_))) => 3 
  case CC_E(CC_A(_), CC_E(CC_A(_), CC_E(_, _))) => 4 
}
}