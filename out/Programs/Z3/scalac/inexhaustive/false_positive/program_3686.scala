package Program_15 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Char, b: T_B[C], c: T_A[C]) extends T_A[C]
case class CC_B[D, E](a: T_A[E]) extends T_A[D]
case class CC_C(a: Boolean) extends T_B[T_A[Int]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_A('x', _, CC_A(_, _, _)) => 2 
  case CC_A(_, _, CC_B(_)) => 3 
  case CC_A('x', _, CC_B(_)) => 4 
  case CC_A(_, _, CC_A(_, _, _)) => 5 
}
}
// This is not matched: (CC_B Char Boolean Wildcard (T_A Char))
// This is not matched: (CC_C Wildcard (CC_C Int (CC_C Int Wildcard T_A) T_A) T_A)