package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_C[D](a: D) extends T_A[D, Boolean]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A Char Int Wildcard (T_A Int Char))