package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: D) extends T_A[Int, D]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A Char)))