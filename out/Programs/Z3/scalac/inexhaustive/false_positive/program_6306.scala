package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[C, T_A[C, Boolean]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants