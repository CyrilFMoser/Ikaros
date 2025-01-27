package Program_29 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: ((Byte,Char),Char)) extends T_A[B]
case class CC_B[C, D](a: Byte) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(CC_A(_, _), ((_,_),_)) => 1 
  case CC_A(CC_A(_, _), _) => 2 
  case CC_A(_, ((_,_),'x')) => 3 
  case CC_A(_, _) => 4 
}
}
// This is not matched: (CC_B Char Boolean Wildcard (T_A Char))
// This is not matched: Pattern match is empty without constants