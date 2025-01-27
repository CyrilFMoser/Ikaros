package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, G](a: G) extends T_A[F, G]

val v_a: CC_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants