package Program_30 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C) extends T_A

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants