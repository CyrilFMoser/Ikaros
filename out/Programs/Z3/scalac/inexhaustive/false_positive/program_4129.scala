package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_D(a: Int) extends T_B[Int]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)