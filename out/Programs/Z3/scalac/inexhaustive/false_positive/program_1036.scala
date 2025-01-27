package Program_30 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (Byte,Byte), b: T_B[C], c: T_A[C]) extends T_A[T_B[Int]]
case class CC_B() extends T_B[CC_A[Byte]]
case class CC_C(a: (CC_B,Int)) extends T_B[CC_A[Byte]]

val v_a: T_A[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A((0,_), CC_C(_), _) => 0 
  case CC_A((_,0), CC_C(_), CC_A(_, _, _)) => 1 
  case CC_A((0,0), CC_C(_), CC_A(_, _, _)) => 2 
  case CC_A((_,_), CC_C(_), _) => 3 
  case CC_A((_,0), _, CC_A(_, _, _)) => 4 
  case CC_A((0,_), CC_B(), CC_A(_, _, _)) => 5 
  case CC_A((_,0), _, _) => 6 
  case CC_A(_, _, CC_A(_, _, _)) => 7 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A (T_B Int)))
// This is not matched: Pattern match is empty without constants