package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D](a: D) extends T_A[T_B, D]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_A Char Int Boolean Wildcard Wildcard (T_A Int Char))