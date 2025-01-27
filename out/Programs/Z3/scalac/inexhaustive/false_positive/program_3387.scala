package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D](a: D) extends T_A[(Char,T_B), D]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Int Boolean (T_A Int Boolean))