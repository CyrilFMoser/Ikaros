package Program_14 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_A[T_B], b: Byte, c: T_A[B]) extends T_A[B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), 0, CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 2 
}
}
// This is not matched: (CC_A T_B T_B Wildcard Wildcard Wildcard (T_A T_B))
// This is not matched: (CC_A (CC_A (CC_A Wildcard Wildcard (CC_C T_A (T_B T_A)) T_A)
//            (CC_C Char (T_B Char))
//            (CC_C T_A (T_B T_A))
//            T_A)
//      Wildcard
//      Wildcard
//      T_A)