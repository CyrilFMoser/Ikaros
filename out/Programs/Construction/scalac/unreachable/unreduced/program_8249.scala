package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte) extends T_A
case class CC_B(a: T_B[Byte, CC_A], b: (CC_A,Int)) extends T_B[CC_A, T_B[(Int,CC_A), T_A]]
case class CC_C(a: Byte, b: CC_B) extends T_B[CC_A, T_B[(Int,CC_A), T_A]]
case class CC_D() extends T_B[CC_A, T_B[(Int,CC_A), T_A]]

val v_a: T_B[CC_A, T_B[(Int,CC_A), T_A]] = null
val v_b: Int = v_a match{
  case CC_B(_, (CC_A(_),12)) => 0 
  case CC_B(_, (CC_A(_),_)) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_D()