package Program_30 

package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D], b: T_A[C, C], c: ((Boolean,Byte),Char)) extends T_A[C, D]
case class CC_B[F, E, G]() extends T_A[F, E]
case class CC_C() extends T_A[T_A[Int, Byte], T_A[Boolean, Int]]

val v_a: T_A[Boolean, T_A[T_A[Int, Byte], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_, _, _), _, ((_,_),_)) => 1 
  case CC_A(CC_B(), _, _) => 2 
  case CC_A(_, _, ((_,_),'x')) => 3 
  case CC_A(CC_B(), _, ((_,_),_)) => 4 
  case CC_A(_, CC_A(_, _, _), ((_,_),_)) => 5 
  case CC_A(CC_B(), CC_B(), ((_,_),'x')) => 6 
  case CC_A(CC_A(_, _, _), CC_B(), ((_,_),'x')) => 7 
  case CC_A(CC_B(), CC_A(_, _, _), ((_,_),_)) => 8 
  case CC_A(CC_B(), CC_B(), ((_,_),_)) => 9 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), ((_,_),_)) => 10 
  case CC_A(_, _, _) => 11 
  case CC_A(_, CC_A(_, _, _), ((_,_),'x')) => 12 
  case CC_A(CC_A(_, _, _), _, ((_,_),'x')) => 13 
}
}
// This is not matched: (CC_B Boolean
//      (T_A (T_A Int Byte) (T_A Boolean Int))
//      Boolean
//      (T_A Boolean (T_A (T_A Int Byte) (T_A Boolean Int))))
// This is not matched: (CC_A (CC_C Wildcard Wildcard Wildcard (T_A Boolean)) (T_A Boolean))