package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Int) extends T_A[B]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)