package Program_29 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B) extends T_A[B]
case class CC_B(a: T_A[Char]) extends T_A[(Char,Int)]

val v_a: T_A[(Char,Int)] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
  case CC_A(_) => 1 
  case CC_A(('x',12)) => 2 
  case CC_B(_) => 3 
}
}
// This is not matched: (CC_A (Tuple Char Int) Boolean Wildcard (T_A (Tuple Char Int)))
// This is not matched: Pattern match is empty without constants