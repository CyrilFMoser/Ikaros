package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, (Int,Char)]
case class CC_B[E, F](a: T_B[F]) extends T_A[E, (Int,Char)]
case class CC_C(a: ((Int,Char),Boolean), b: Boolean) extends T_A[T_A[Byte, Boolean], (Int,Char)]
case class CC_D[G, H](a: H, b: CC_C) extends T_B[G]
case class CC_E(a: T_A[CC_C, Boolean], b: CC_C, c: T_B[CC_C]) extends T_B[CC_C]
case class CC_F[I]() extends T_B[I]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_F() => 1 
  case CC_E(_, CC_C(_, _), CC_D(_, _)) => 2 
}
}
// This is not matched: (CC_E Wildcard
//      (CC_C Wildcard Wildcard (T_A (T_A Byte Boolean) (Tuple Int Char)))
//      (CC_E Wildcard
//            Wildcard
//            Wildcard
//            (T_B (CC_C Boolean Boolean (T_A Boolean Boolean))))
//      (T_B (CC_C Boolean Boolean Boolean)))
// This is not matched: (CC_E Wildcard
//      (CC_C Wildcard Wildcard (T_A (T_A Byte Boolean) (Tuple Int Char)))
//      (CC_E Wildcard
//            Wildcard
//            Wildcard
//            (T_B (CC_C Boolean Boolean (T_A Boolean Boolean))))
//      (T_B (CC_C Boolean Boolean Boolean)))