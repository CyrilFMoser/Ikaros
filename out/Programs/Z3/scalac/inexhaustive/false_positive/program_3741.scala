package Program_13 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: T_A[B], c: Char) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 1 
  case CC_A(_, _, _) => 2 
}
}
// This is not matched: (CC_A Char
//      (CC_A Boolean Boolean Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Char))
// This is not matched: (CC_D Char Wildcard Wildcard (T_B Char))