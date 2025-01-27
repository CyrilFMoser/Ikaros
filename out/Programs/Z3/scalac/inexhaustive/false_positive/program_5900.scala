package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[G](a: G) extends T_A[T_A[G, Int], G]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants