package Program_15 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,Int), b: Byte) extends T_A[Boolean, T_A[Char, Char]]

val v_a: T_A[Boolean, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_A((_,_), 0) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A Boolean (T_A Char Char)))
// This is not matched: (CC_A Char T_B Wildcard Wildcard Wildcard (T_A Char T_B))