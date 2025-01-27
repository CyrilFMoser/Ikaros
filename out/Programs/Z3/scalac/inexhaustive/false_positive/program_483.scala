package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: ((Int,Char),Boolean), b: T_A[B], c: B) extends T_A[Char]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), _, 12) => 0 
  case CC_A(_, _, 12) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants