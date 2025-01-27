package Program_31 

object Test {
sealed trait T_B[C, D]
case class CC_B[F](a: (Int,Int), b: T_B[F, F]) extends T_B[F, T_B[F, F]]

val v_a: T_B[Int, T_B[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B((12,_), _) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard T_B)