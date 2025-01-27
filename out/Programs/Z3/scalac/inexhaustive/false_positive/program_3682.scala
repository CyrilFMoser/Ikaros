package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_B[G](a: Byte) extends T_A[T_A[Int, Byte], G]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_D (T_B (Tuple Byte Byte) (T_A Int)))