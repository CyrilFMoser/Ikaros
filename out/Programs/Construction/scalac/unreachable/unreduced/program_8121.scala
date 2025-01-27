package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B, T_B]
case class CC_B(a: CC_A, b: T_A[Int, CC_A], c: T_A[T_B, T_B]) extends T_B
case class CC_C(a: CC_B, b: T_B) extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _)) => 0 
  case CC_A(CC_C(_, _)) => 1 
}
}