package Program_30 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C[D](a: T_A[D]) extends T_B
case class CC_D(a: T_A[(T_B,Byte)]) extends T_B

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_)) => 0 
}
}
// This is not matched: CC_A(CC_C(_))
// This is not matched: CC_B()