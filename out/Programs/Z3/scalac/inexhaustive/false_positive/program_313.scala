package Program_30 

package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: (Byte,(Char,Boolean))) extends T_A[T_A[Byte]]
case class CC_B[B](a: CC_A) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A (T_A Byte)))
// This is not matched: (CC_A (Tuple T_B Char) T_B (T_A (Tuple T_B Char)))