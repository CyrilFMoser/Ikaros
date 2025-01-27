package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: ((T_A,CC_A),Byte), c: T_B[CC_A, T_A]) extends T_A
case class CC_C(a: (CC_A,Char), b: T_A) extends T_A
case class CC_D[C](a: T_B[C, C], b: CC_B, c: Char) extends T_B[C, T_B[CC_B, CC_B]]
case class CC_E[D](a: CC_B, b: CC_B) extends T_B[D, T_B[CC_B, CC_B]]
case class CC_F[E](a: E) extends T_B[E, T_B[CC_B, CC_B]]

val v_a: T_B[CC_A, T_B[CC_B, CC_B]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, _) => 1 
  case CC_F(CC_A()) => 2 
}
}