package Program_30 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: T_A[Boolean], c: Byte) extends T_A[T_A[Char]]
case class CC_B[B](a: B) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A (T_A Char)))
// This is not matched: (CC_E T_B)