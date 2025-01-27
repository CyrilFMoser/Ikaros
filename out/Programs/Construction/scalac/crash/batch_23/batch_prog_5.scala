package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}