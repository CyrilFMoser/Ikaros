package Program_12 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B], c: B) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 0 
  case CC_A(_, _, _) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A (T_A Byte)))
// This is not matched: (CC_B (Tuple (CC_C Wildcard Wildcard T_A) (Tuple Wildcard Byte)) Wildcard T_A)