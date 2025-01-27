package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: C) extends T_A[C, D]

val v_a: CC_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants