package Program_15 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[D], b: (Boolean,Boolean)) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Char))
// This is not matched: (CC_D Char Wildcard Wildcard Char (T_B Char))