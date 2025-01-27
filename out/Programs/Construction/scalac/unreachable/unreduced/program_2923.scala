package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B, T_B], T_A[Boolean, T_B]], T_B]
case class CC_B(a: T_B, b: T_B) extends T_A[T_A[T_A[T_B, T_B], T_A[Boolean, T_B]], T_B]
case class CC_C(a: CC_B, b: CC_A) extends T_A[T_A[T_A[T_B, T_B], T_A[Boolean, T_B]], T_B]
case class CC_D(a: CC_A) extends T_B
case class CC_E(a: T_B, b: CC_D, c: Byte) extends T_B
case class CC_F(a: T_A[CC_C, CC_E], b: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F(_, CC_C(_, CC_A())) => 2 
}
}