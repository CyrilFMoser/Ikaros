package Program_15 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[D], b: T_A[Boolean]) extends T_A[C]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F](a: F, b: T_A[Char], c: T_B[F]) extends T_B[F]
case class CC_D(a: CC_A[Int, Char], b: CC_C[Char]) extends T_B[CC_A[(Byte,Char), Int]]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(12, _, _) => 0 
  case CC_C(_, CC_B(_), _) => 1 
  case CC_C(12, CC_B(_), _) => 2 
  case CC_C(12, CC_A(_, _), _) => 3 
}
}
// This is not matched: (CC_C Int
//      Int
//      (CC_A Char
//            (T_A Boolean)
//            (CC_B (T_A Boolean) Wildcard (T_A (T_A Boolean)))
//            Wildcard
//            (T_A Char))
//      Wildcard
//      (T_B Int))
// This is not matched: (CC_C Int
//      Int
//      (CC_A Char
//            (T_A Boolean)
//            (CC_B (T_A Boolean) Wildcard (T_A (T_A Boolean)))
//            Wildcard
//            (T_A Char))
//      Wildcard
//      (T_B Int))