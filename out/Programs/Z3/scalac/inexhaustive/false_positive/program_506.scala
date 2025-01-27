package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B, b: C, c: T_A[C]) extends T_A[B]
case class CC_B[D](a: Int, b: Byte) extends T_A[D]
case class CC_C[E, F](a: (Int,Boolean), b: T_A[E]) extends T_A[E]

val v_a: CC_C[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
  case CC_C(_, CC_B(_, _)) => 1 
  case CC_C((12,_), CC_A(_, _, _)) => 2 
  case CC_C((_,_), CC_A(_, _, _)) => 3 
}
}
// This is not matched: (CC_C Byte
//      Byte
//      Wildcard
//      (CC_C Byte
//            Boolean
//            Wildcard
//            (CC_C Byte Boolean (Tuple Wildcard Boolean) Wildcard (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))
// This is not matched: (CC_B Int (T_A (Tuple (Tuple Int Boolean) Char) Int))