package Program_28 

package Program_1 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A) extends T_A

val v_a: CC_A[T_A] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard (CC_A T_A Wildcard Wildcard T_A) T_A)
// This is not matched: Pattern match is empty without constants