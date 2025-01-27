package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B() extends T_A[T_B[Char], Byte]
case class CC_E[G](a: T_A[G, G], b: G) extends T_B[G]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_E(_, 'x') => 0 
}
}
// This is not matched: Pattern match is empty without constants