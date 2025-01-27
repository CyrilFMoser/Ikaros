package Program_31 

object Test {
sealed trait T_B[B]
case class CC_C[D](a: D) extends T_B[D]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants