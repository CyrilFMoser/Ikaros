package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B, b: T_A[B], c: ((Char,Byte),Boolean)) extends T_A[B]
case class CC_B[D]() extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _, _) => 1 
  case CC_A(_, CC_B(), ((_,_),_)) => 2 
  case CC_A('x', _, ((_,_),_)) => 3 
  case CC_A('x', CC_B(), ((_,_),_)) => 4 
  case CC_A('x', _, _) => 5 
  case CC_A(_, CC_A(_, _, _), ((_,_),_)) => 6 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Char))
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)