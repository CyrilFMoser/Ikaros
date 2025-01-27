package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_C[F](a: F) extends T_A[F, T_A[Int, Char]]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_D (CC_A T_A) (CC_A T_A) (T_B (CC_A T_A) (CC_A T_A)))