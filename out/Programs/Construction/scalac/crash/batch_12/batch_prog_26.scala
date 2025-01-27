package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: Boolean, c: C) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_B
case class CC_C(a: CC_B, b: T_A[T_A[T_B, CC_B], T_A[CC_B, CC_B]]) extends T_B
case class CC_D(a: Int, b: (CC_B,T_B), c: (CC_A[CC_C],Boolean)) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), _) => 0 
}
}