package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[T_A[(Boolean,Int)]]
case class CC_B(a: T_B, b: T_A[T_A[CC_A]]) extends T_B
case class CC_C(a: CC_B, b: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_C(CC_B(_, _), _), _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(CC_B(_, _), _)