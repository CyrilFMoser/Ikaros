package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_B(a: Int) extends T_A[T_B[Int]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Int Byte (T_A Int Byte))