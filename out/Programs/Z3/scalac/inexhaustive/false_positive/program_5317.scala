package Program_15 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[Boolean], b: D) extends T_A[D]
case class CC_B[F, E, G](a: T_A[E], b: G, c: T_B[F, E]) extends T_B[F, E]
case class CC_C[H](a: T_A[H], b: T_B[H, H], c: H) extends T_B[H, T_A[Boolean]]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: (CC_B Char
//      Int
//      Boolean
//      (CC_A Int
//            (CC_A Boolean Wildcard Wildcard (T_A Boolean))
//            Wildcard
//            (T_A Int))
//      Wildcard
//      Wildcard
//      (T_B Char Int))
// This is not matched: Pattern match is empty without constants