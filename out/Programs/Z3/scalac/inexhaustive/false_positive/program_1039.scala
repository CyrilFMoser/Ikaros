package Program_31 

package Program_8 

object Test {
sealed trait T_A
case class CC_A[A](a: Boolean, b: T_A, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A (Tuple Boolean Char)))