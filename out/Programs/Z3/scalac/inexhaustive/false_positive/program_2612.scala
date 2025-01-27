package Program_31 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: Int, b: T_B[B], c: Boolean) extends T_A
case class CC_B(a: CC_A[T_A], b: T_B[T_A]) extends T_A
case class CC_C[C](a: T_A) extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(12, CC_C(_), _) => 1 
  case CC_B(CC_A(_, _, _), _) => 2 
}
}
// This is not matched: (CC_A T_A
//      Wildcard
//      (CC_C T_A
//            (CC_B (CC_A T_A Int (CC_C T_A Wildcard (T_B T_A)) Wildcard T_A)
//                  Wildcard
//                  T_A)
//            (T_B T_A))
//      Wildcard
//      T_A)
// This is not matched: (CC_B Wildcard (T_A (CC_A Boolean Boolean Boolean)))