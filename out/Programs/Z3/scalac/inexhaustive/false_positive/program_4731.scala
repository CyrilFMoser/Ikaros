package Program_13 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E](a: Int, b: E) extends T_A[E, T_A[(Char,Char), T_B]]
case class CC_C(a: CC_A[T_B, T_B]) extends T_B
case class CC_D(a: T_A[(Char,Boolean), T_B]) extends T_B
case class CC_E[F](a: F) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_E(_) => 1 
  case CC_D(_) => 2 
}
}
// This is not matched: (CC_E Boolean Boolean T_B)
// This is not matched: (CC_B Int
//      Wildcard
//      (CC_A Int
//            Wildcard
//            Wildcard
//            (CC_B Int Wildcard Wildcard Wildcard (T_A Int))
//            (T_A Int))
//      Wildcard
//      (T_A Int))