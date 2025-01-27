package Program_15 

package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C]) extends T_A[B]
case class CC_B[D](a: T_A[D], b: D, c: T_A[D]) extends T_A[D]
case class CC_C[E](a: T_A[E], b: (Char,Char)) extends T_A[E]

val v_a: CC_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_C(_, _)) => 1 
  case CC_A(CC_B(_, _, _)) => 2 
}
}
// This is not matched: (CC_A Int
//      Int
//      (CC_A Int
//            Boolean
//            (CC_C Boolean Wildcard (Tuple Wildcard Char) (T_A Boolean))
//            (T_A Int))
//      (T_A Int))
// This is not matched: (CC_B Byte (Tuple Wildcard Wildcard) (T_A Byte))