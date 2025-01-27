package Program_14 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[D], b: (Int,Boolean)) extends T_A[E, D]
case class CC_B[F](a: CC_A[F, F]) extends T_B[F]
case class CC_C[G, H]() extends T_B[G]
case class CC_D(a: T_A[Byte, Boolean]) extends T_B[T_B[Byte]]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_C Byte Boolean (T_B Byte))
// This is not matched: (CC_A T_A
//      Wildcard
//      (CC_A (CC_A T_A T_A T_A T_A (CC_A T_A T_A T_A T_A T_A))
//            Wildcard
//            Wildcard
//            Wildcard
//            T_A)
//      Wildcard
//      T_A)