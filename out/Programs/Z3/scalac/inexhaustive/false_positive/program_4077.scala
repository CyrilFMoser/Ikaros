package Program_14 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Char, Boolean], b: T_A[Boolean, Boolean], c: T_B[Boolean, Int]) extends T_A[Int, T_B[Int, Boolean]]
case class CC_B[E](a: E) extends T_A[CC_A, E]
case class CC_C[G, F, H](a: Byte, b: H) extends T_B[F, G]
case class CC_D[J, I](a: CC_C[I, J, CC_A]) extends T_B[I, J]

val v_a: T_A[Int, T_B[Int, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D(_)) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      Wildcard
//      (CC_C Int Boolean Boolean Wildcard Wildcard (T_B Boolean Int))
//      (T_A Int (T_B Int Boolean)))
// This is not matched: (CC_A T_A
//      (CC_A (CC_A T_A T_A T_A (CC_A T_A T_A T_A T_A T_A) T_A)
//            Wildcard
//            Wildcard
//            Wildcard
//            T_A)
//      Wildcard
//      Wildcard
//      T_A)