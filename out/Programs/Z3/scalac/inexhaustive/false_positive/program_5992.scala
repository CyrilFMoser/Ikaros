package Program_15 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[C, C]]
case class CC_B[D, E](a: D, b: T_A[E, Int]) extends T_A[D, T_A[D, D]]
case class CC_C[F](a: CC_A[F], b: CC_B[F, F], c: F) extends T_A[F, T_A[F, F]]

val v_a: CC_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B Char
//      Boolean
//      (CC_A Int
//            Wildcard
//            (CC_B Int Boolean Wildcard Wildcard Wildcard (T_A Int))
//            Wildcard
//            (T_A Int))
//      Char
//      Wildcard
//      (T_A Char))