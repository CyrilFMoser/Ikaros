package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Int) extends T_A[C, D]

val v_a: CC_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants