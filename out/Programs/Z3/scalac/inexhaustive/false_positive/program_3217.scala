package Program_14 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B) extends T_A[T_A[T_B, T_B], C]
case class CC_B[D, E](a: Boolean) extends T_A[T_A[T_B, T_B], D]

val v_a: T_A[T_A[T_B, T_B], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_B Int T_B Wildcard (T_A (T_A T_B T_B) Int))
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A (T_B Char Char) Char))