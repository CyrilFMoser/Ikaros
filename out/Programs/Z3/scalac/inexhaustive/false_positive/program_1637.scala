package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_B, C], C]
case class CC_B(a: Byte) extends T_A[T_A[T_B, CC_A[T_B]], CC_A[T_B]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants