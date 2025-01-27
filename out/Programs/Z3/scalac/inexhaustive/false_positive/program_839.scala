package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[Int]]
case class CC_B[D](a: D) extends T_B[CC_A, D]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_C (T_A (T_A Byte Byte) (T_A Int Int)))