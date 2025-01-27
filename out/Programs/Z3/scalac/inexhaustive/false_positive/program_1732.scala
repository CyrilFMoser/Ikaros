package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,Int), b: T_A[C, Byte], c: C) extends T_A[Boolean, T_A[Int, Int]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,12), _, 'x') => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A (CC_B Boolean Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      (T_A (T_A (CC_B Boolean Boolean Boolean Boolean Boolean)
//                (CC_B Boolean Boolean Boolean Boolean Boolean))
//           (CC_B Boolean Boolean Boolean Boolean Boolean)))