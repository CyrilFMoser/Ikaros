package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B, (Boolean,Int)], Int]) extends T_A[T_B, T_A[T_B, T_B]]
case class CC_B(a: T_A[T_B, CC_A]) extends T_B
case class CC_C(a: Byte, b: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
}
}