package Program_15 

package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Int,Byte), b: T_A[Boolean]) extends T_A[B]
case class CC_B[C, D]() extends T_A[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A((_,_), CC_A(_, _)) => 1 
  case CC_A((12,0), CC_A(_, _)) => 2 
  case CC_A(_, CC_B()) => 3 
  case CC_A((_,0), CC_A(_, _)) => 4 
  case CC_A((12,_), _) => 5 
  case CC_A((12,0), CC_B()) => 6 
  case CC_A(_, _) => 7 
  case CC_A((12,0), _) => 8 
  case CC_A((_,0), _) => 9 
}
}
// This is not matched: (CC_B Byte (CC_A Boolean (T_A Boolean) Boolean Boolean) (T_A Byte))
// This is not matched: (CC_A T_A)