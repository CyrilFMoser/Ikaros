package Program_30 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: (Byte,Boolean), c: T_A[B]) extends T_A[B]
case class CC_B[C, D]() extends T_A[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B(), (0,_), _) => 1 
  case CC_A(CC_A(_, _, _), (0,_), CC_A(_, _, _)) => 2 
  case CC_A(_, _, _) => 3 
  case CC_A(_, (0,_), CC_B()) => 4 
}
}
// This is not matched: (CC_B Byte Boolean (T_A Byte))
// This is not matched: Pattern match is empty without constants