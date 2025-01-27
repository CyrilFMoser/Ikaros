package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[E](a: T_A[E, E], b: E) extends T_A[E, T_B[Boolean]]

val v_a: T_A[Byte, T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
}
}
// This is not matched: Pattern match is empty without constants