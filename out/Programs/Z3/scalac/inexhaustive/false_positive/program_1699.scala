package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, Byte]
case class CC_C[E](a: T_A[E, E], b: E) extends T_B[E]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, 12) => 0 
}
}
// This is not matched: Pattern match is empty without constants