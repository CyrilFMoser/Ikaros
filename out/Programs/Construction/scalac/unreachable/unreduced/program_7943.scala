package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_A[Char, T_A[T_B, T_B]], T_A[(T_B,T_B), Byte]]
case class CC_B() extends T_B
case class CC_C(a: CC_B, b: CC_B, c: T_A[T_A[CC_A, T_B], CC_A]) extends T_B
case class CC_D(a: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_A()) => 1 
}
}
// This is not matched: CC_B()