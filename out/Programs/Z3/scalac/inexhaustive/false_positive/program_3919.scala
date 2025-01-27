package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[E](a: Byte) extends T_A[T_B[Boolean], E]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A T_A)