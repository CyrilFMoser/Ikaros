package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: T_A[D, D], b: D) extends T_A[(Int,Boolean), D]

val v_a: T_A[(Int,Boolean), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)