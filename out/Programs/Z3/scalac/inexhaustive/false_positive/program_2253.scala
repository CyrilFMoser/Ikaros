package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (Int,Char)) extends T_A[C, T_A[C, C]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
  case CC_A((12,'x')) => 1 
  case CC_A((_,_)) => 2 
  case CC_B() => 3 
}
}
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int (T_A Int Int)))
// This is not matched: (CC_B Wildcard
//      Wildcard
//      (Tuple (CC_B Wildcard (CC_A Wildcard T_A) Wildcard T_A) Wildcard)
//      T_A)