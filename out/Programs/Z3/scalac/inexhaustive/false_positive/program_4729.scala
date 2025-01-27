package Program_15 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A, b: C, c: T_B[C, C]) extends T_A
case class CC_B(a: T_B[T_A, (Int,Char)]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_), _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B Int
//      Wildcard
//      (CC_A Int
//            Wildcard
//            Wildcard
//            (CC_B Int Wildcard Wildcard Wildcard (T_A Int))
//            (T_A Int))
//      Wildcard
//      (T_A Int))