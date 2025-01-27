package Program_15 

object Test {
sealed trait T_B[C, D]
case class CC_E[J](a: T_B[J, J], b: J) extends T_B[T_B[J, J], J]

val v_a: T_B[T_B[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_E(_, 12) => 0 
}
}
// This is not matched: Pattern match is empty without constants