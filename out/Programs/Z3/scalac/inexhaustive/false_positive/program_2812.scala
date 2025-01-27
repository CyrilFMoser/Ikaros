package Program_30 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_A, b: Byte) extends T_A
case class CC_B[C](a: T_B[T_A], b: T_B[C], c: T_A) extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants