package Program_29 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: (Char,Int)) extends T_A[D]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A((_,12)) => 1 
}
}
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int))
// This is not matched: (CC_B (T_A Int Char) Char Wildcard Wildcard (T_A (T_A Int Char) Char))