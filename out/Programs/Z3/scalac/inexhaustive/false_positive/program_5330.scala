package Program_15 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: Boolean, b: T_A) extends T_A
case class CC_B(a: ((Int,Byte),Boolean)) extends T_B[T_A]

val v_a: CC_A[T_A] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard (CC_A T_A Boolean Wildcard T_A) T_A)
// This is not matched: (CC_A T_A Wildcard (CC_A T_A Boolean Wildcard T_A) T_A)