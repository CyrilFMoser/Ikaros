package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[Boolean, D], b: D) extends T_A[D]
case class CC_B[E]() extends T_B[E, CC_A[Int]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: Pattern match is empty without constants