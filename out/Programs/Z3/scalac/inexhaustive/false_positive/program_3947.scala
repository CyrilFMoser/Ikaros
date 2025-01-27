package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_B[F](a: F) extends T_A[F, T_A[Int, Char]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_A (CC_A Char Boolean) (T_A (CC_A Char Boolean)))