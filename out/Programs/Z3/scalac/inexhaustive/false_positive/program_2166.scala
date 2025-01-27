package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: T_A[D], c: D) extends T_A[D]
case class CC_B[E, F](a: Boolean, b: F, c: T_B[F, Byte]) extends T_A[E]
case class CC_C[G, H, I]() extends T_B[G, H]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_C()) => 0 
  case CC_A(_, _, 'x') => 1 
  case CC_A(_, _, _) => 2 
  case CC_A(_, CC_B(_, _, _), _) => 3 
}
}
// This is not matched: (CC_B Char
//      (T_B (T_A Boolean) (T_A Boolean))
//      Boolean
//      (CC_C (T_A Boolean)
//            (T_A Boolean)
//            Boolean
//            (T_B (T_A Boolean) (T_A Boolean)))
//      Wildcard
//      (T_A Char))
// This is not matched: (CC_D Wildcard
//      Wildcard
//      (CC_B (CC_C Boolean T_B)
//            (CC_C Wildcard (T_A (T_A Int)))
//            Wildcard
//            Wildcard
//            (T_A (CC_C Boolean T_B)))
//      T_B)