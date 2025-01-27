package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Byte]]
case class CC_B[B](a: B) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A (T_A Byte)))
// This is not matched: (CC_C Wildcard (T_A (Tuple Char Char) (T_B Byte)))