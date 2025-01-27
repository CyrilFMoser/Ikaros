package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B(a: T_A[T_A[T_B, T_B], CC_A[T_B]], b: Byte) extends T_A[T_B, CC_A[CC_A[Int]]]
case class CC_C() extends T_B
case class CC_D(a: T_A[T_B, Char]) extends T_B
case class CC_E(a: Byte, b: T_A[CC_B, T_B], c: T_A[T_B, CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
  case CC_E(_, _, _) => 2 
}
}