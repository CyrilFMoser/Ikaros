package Program_30 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: C, c: T_A[Boolean]) extends T_A[B]
case class CC_B(a: T_A[Boolean], b: CC_A[(Byte,Int), Int], c: Boolean) extends T_A[CC_A[(Byte,Byte), Byte]]
case class CC_C(a: CC_A[CC_B, CC_B], b: T_A[(Char,Char)], c: CC_B) extends T_A[CC_A[(Byte,Byte), Byte]]

val v_a: T_A[T_A[CC_A[(Byte,Byte), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A (T_A (CC_A (Tuple Byte Byte) Byte Boolean Boolean Boolean Boolean))
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_A (CC_A (Tuple Byte Byte) Byte Boolean Boolean Boolean Boolean))))
// This is not matched: (CC_E (T_A Char Int)
//      (CC_A Int Char Char (T_A Char Int))
//      (CC_B (T_A Char Int)
//            (T_A Char Int)
//            Wildcard
//            (CC_C Wildcard (T_B (T_A Char Int)))
//            Wildcard
//            (T_A (T_A Char Int) (T_A Char Int)))
//      (T_B (T_A Char Int)))