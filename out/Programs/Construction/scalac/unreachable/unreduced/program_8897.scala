package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_B[T_B[CC_A]]) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D(a: CC_B, b: T_A, c: T_B[CC_B]) extends T_B[CC_A]
case class CC_E(a: T_B[CC_A], b: T_A, c: (CC_D,CC_C)) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, _, _) => 1 
}
}