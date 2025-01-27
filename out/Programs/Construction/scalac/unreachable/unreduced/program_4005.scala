package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Byte, b: T_A[T_B, T_B], c: T_A[T_B, T_B]) extends T_A[T_B, (T_B,T_A[T_B, T_B])]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: (Byte,T_A[CC_B, Int])) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
  case CC_B(CC_C((_,_))) => 1 
}
}