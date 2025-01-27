package Program_15 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[D], b: T_A[D]) extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_A Char
//      Boolean
//      (CC_A Char
//            (T_A (T_A Boolean))
//            Wildcard
//            (CC_A Char Boolean Wildcard Wildcard (T_A Char))
//            (T_A Char))
//      Wildcard
//      (T_A Char))
// This is not matched: (CC_B T_A)