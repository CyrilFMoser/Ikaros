package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: (Int,Byte)) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_A((12,_)) => 1 
  case CC_A((12,0)) => 2 
}
}
// This is not matched: (CC_A Char Boolean Wildcard (T_A Char))
// This is not matched: Pattern match is empty without constants