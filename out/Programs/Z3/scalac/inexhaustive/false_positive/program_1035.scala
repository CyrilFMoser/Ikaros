package Program_31 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (Byte,Byte), b: T_B[C], c: T_A[C]) extends T_A[T_B[Int]]
case class CC_B() extends T_B[CC_A[Byte]]
case class CC_C(a: (CC_B,Int)) extends T_B[CC_A[Byte]]

val v_a: T_A[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A((0,0), _, CC_A(_, _, _)) => 0 
  case CC_A((_,_), _, CC_A(_, _, _)) => 1 
  case CC_A((0,0), CC_B(), CC_A(_, _, _)) => 2 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A (T_B Int)))
// This is not matched: Pattern match is empty without constants