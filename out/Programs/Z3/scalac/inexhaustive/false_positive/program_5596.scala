package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_B[G](a: G) extends T_A[T_A[Char, Char], G]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_D Wildcard Wildcard (T_B (T_A Int)))