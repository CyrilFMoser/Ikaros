package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B[G]() extends T_A[G, Boolean]
case class CC_D[J](a: J) extends T_B[CC_B[Int], J]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants