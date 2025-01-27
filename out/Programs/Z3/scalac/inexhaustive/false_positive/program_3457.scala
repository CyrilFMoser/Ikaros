package Program_13 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Char, b: T_A[D, D], c: D) extends T_A[T_A[Boolean, (Char,Char)], C]
case class CC_B(a: CC_A[Int, (Byte,Int)]) extends T_A[T_A[Boolean, (Char,Char)], CC_A[Boolean, Int]]

val v_a: T_A[T_A[Boolean, (Char,Char)], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Byte
//      (T_A Boolean (Tuple Char Char))
//      Wildcard
//      (CC_A (T_A Boolean (Tuple Char Char))
//            Boolean
//            Wildcard
//            Wildcard
//            Boolean
//            (T_A (T_A Boolean (Tuple Char Char))
//                 (T_A Boolean (Tuple Char Char))))
//      Wildcard
//      (T_A (T_A Boolean (Tuple Char Char)) Byte))
// This is not matched: (CC_B (T_A Byte))