package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: Byte, b: T_A[CC_A]) extends T_B
case class CC_C(a: CC_B, b: CC_B, c: Int) extends T_B
case class CC_D(a: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(0, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
  case CC_D(_) => 3 
}
}