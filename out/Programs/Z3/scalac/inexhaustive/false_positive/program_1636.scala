package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[D, D]) extends T_A[C, D]
case class CC_B[F, G](a: G, b: T_A[G, G]) extends T_A[T_A[F, F], F]
case class CC_C(a: CC_B[Boolean, Char], b: Int) extends T_A[T_A[(Boolean,Char), (Boolean,Char)], (Boolean,Char)]

val v_a: CC_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_)) => 0 
  case CC_B(12, CC_A(_)) => 1 
}
}
// This is not matched: (CC_B Boolean
//      Int
//      Wildcard
//      (CC_A Int
//            Int
//            (T_A Boolean Boolean)
//            (CC_A Int Int Boolean Wildcard (T_A Int Int))
//            (T_A Int Int))
//      (T_A (T_A Boolean Boolean) Boolean))
// This is not matched: (CC_C Char (T_A Char))