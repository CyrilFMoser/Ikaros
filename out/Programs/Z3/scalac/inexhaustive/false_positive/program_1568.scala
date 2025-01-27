package Program_29 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[Boolean], b: T_A[B]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A (T_A Char)
//      Wildcard
//      (CC_A (CC_A Boolean Boolean Boolean Boolean)
//            Wildcard
//            Wildcard
//            (T_A (T_A Char)))
//      (T_A (T_A Char)))
// This is not matched: (CC_A (CC_A Byte Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (CC_A Byte Boolean Boolean Boolean Boolean)))