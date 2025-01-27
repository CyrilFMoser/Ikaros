package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Char,Byte)) extends T_A[T_A[Char]]
case class CC_B[B]() extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A((_,0)) => 1 
  case CC_A((_,_)) => 2 
}
}
// This is not matched: (CC_B Boolean (T_A (T_A Char)))
// This is not matched: (CC_B Byte Wildcard (T_B Byte))