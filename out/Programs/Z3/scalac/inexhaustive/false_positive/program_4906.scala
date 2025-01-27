package Program_13 

package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Boolean,Byte)], b: T_A[Boolean]) extends T_A[T_A[Char]]
case class CC_B[B](a: Byte) extends T_A[CC_A]
case class CC_C(a: (CC_A,CC_A)) extends T_A[T_A[Char]]

val v_a: T_A[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A (CC_A Boolean Boolean Boolean)))
// This is not matched: (CC_A Char
//      Wildcard
//      Wildcard
//      (CC_A Char
//            Wildcard
//            Wildcard
//            (CC_A Char Wildcard Wildcard Wildcard (T_A Char))
//            (T_A Char))
//      (T_A Char))