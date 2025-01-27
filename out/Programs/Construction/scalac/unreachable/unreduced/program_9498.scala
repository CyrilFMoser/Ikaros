package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[T_A]) extends T_A
case class CC_B(a: (CC_A,T_A)) extends T_A
case class CC_C() extends T_B[CC_A]
case class CC_D(a: CC_B, b: CC_A) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B((_,_)), CC_A(_, _)) => 1 
}
}