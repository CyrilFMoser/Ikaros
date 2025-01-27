package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[C], b: T_A[Char]) extends T_A[C]
case class CC_B[E, F](a: Byte, b: (Boolean,Boolean)) extends T_A[E]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,_)) => 0 
  case CC_A(_, _) => 1 
  case CC_A(CC_A(_, _), _) => 2 
  case CC_A(CC_B(_, _), CC_B(_, _)) => 3 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 4 
}
}
// This is not matched: (CC_B Char Boolean Byte Wildcard (T_A Char))
// This is not matched: (CC_E Wildcard (CC_F T_B) Wildcard T_B)