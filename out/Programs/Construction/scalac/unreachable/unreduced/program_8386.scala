package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int, b: T_A[(T_B,Int)]) extends T_A[T_B]
case class CC_B(a: (T_A[CC_A],CC_A), b: T_A[T_B]) extends T_B
case class CC_C(a: Byte, b: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_C(_, _) => 1 
}
}