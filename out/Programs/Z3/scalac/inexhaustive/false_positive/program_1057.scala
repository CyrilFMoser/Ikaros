package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[Byte]) extends T_A[T_A[T_B]]
case class CC_B() extends T_B
case class CC_C() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A Char (T_A (Tuple Char Int) Boolean)))