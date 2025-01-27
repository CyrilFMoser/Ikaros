package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[Byte, T_A[T_A[T_B, T_B], Boolean]]
case class CC_B() extends T_A[Byte, T_A[T_A[T_B, T_B], Boolean]]
case class CC_C() extends T_A[Byte, T_A[T_A[T_B, T_B], Boolean]]
case class CC_D(a: CC_A, b: T_A[CC_B, CC_B], c: CC_C) extends T_B
case class CC_E[C](a: C, b: CC_A, c: CC_C) extends T_B
case class CC_F() extends T_B

val v_a: T_A[Byte, T_A[T_A[T_B, T_B], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_A(_), _, CC_C())) => 0 
  case CC_A(CC_E(_, _, _)) => 1 
  case CC_A(CC_F()) => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_B()