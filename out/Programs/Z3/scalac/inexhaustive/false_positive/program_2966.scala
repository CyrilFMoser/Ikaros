package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: Byte) extends T_A[C, D]

val v_a: CC_A[Int, T_B] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants