package Program_30 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, ((Boolean,Int),Int)]
case class CC_B(a: (Int,Boolean), b: T_B[Byte], c: T_B[Char]) extends T_A[(Int,Byte), ((Boolean,Int),Int)]
case class CC_C[E](a: CC_A[E], b: (Int,CC_B), c: CC_B) extends T_B[CC_A[CC_B]]

val v_a: T_B[CC_A[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
}
}
// This is not matched: (CC_C Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (CC_A (CC_B Boolean Boolean Boolean Boolean) Boolean)))
// This is not matched: (CC_A Wildcard
//      (CC_A Byte
//            (CC_B Wildcard Wildcard (CC_B Boolean Wildcard Wildcard T_A) T_A)
//            T_A)
//      T_A)