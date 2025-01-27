package Program_31 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_A) extends T_A
case class CC_B(a: T_B[T_A], b: T_B[Int]) extends T_B[(T_A,T_A)]
case class CC_C(a: CC_A[CC_B], b: T_B[Byte]) extends T_B[(T_A,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_A Wildcard (CC_C T_A) T_A)