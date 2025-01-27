package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[E, F](a: Int) extends T_A[E, F]

val v_a: CC_B[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_C Int Char Wildcard (T_A Int Char))