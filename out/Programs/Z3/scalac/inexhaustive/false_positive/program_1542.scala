package Program_29 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: Int) extends T_A[C, D]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(12) => 1 
}
}
// This is not matched: (CC_A Int Boolean Boolean Wildcard (T_A Int Boolean))
// This is not matched: (CC_A Char Char Char (T_A Char Char))