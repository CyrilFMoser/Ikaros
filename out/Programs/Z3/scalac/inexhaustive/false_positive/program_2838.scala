package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: (Int,Char), c: T_A[B]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A (T_A Byte)
//      Wildcard
//      Wildcard
//      (CC_A Boolean Wildcard Wildcard Wildcard (T_A (T_A Byte)))
//      (T_A (T_A Byte)))
// This is not matched: (CC_A Byte Boolean (T_A Byte))