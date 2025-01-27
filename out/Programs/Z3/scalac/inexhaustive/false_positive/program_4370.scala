package Program_15 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: C) extends T_A[D, C]
case class CC_B[E, F](a: Char, b: CC_A[E, F]) extends T_A[T_A[Int, (Byte,Boolean)], E]
case class CC_C(a: CC_A[(Byte,Byte), Byte], b: Boolean) extends T_A[T_A[Int, (Byte,Boolean)], CC_B[Int, Char]]

val v_a: T_A[T_A[Int, (Byte,Boolean)], Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
  case CC_A(_) => 1 
  case CC_B(_, _) => 2 
  case CC_B('x', CC_A(_)) => 3 
}
}
// This is not matched: (CC_B Char Boolean Wildcard Wildcard (T_A (T_A Int (Tuple Byte Boolean)) Char))
// This is not matched: (CC_D Wildcard T_B)