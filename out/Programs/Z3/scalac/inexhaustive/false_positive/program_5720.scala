package Program_15 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[Boolean, T_B[Char, Int]]
case class CC_B[F, G, H](a: T_A[F, F], b: Byte, c: CC_A[H]) extends T_A[F, G]
case class CC_C(a: (Char,Boolean), b: T_B[Byte, (Byte,Int)], c: T_A[Int, Byte]) extends T_A[Boolean, T_B[Char, Int]]
case class CC_D[I, J](a: Char, b: CC_B[Boolean, J, J], c: J) extends T_B[J, I]
case class CC_E[K, L]() extends T_B[L, K]
case class CC_F[M, N]() extends T_B[M, N]

val v_a: T_A[Boolean, T_B[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_B(CC_B(_, _, _), _, CC_A(_)) => 2 
  case CC_C((_,_), CC_D(_, _, _), CC_B(_, _, _)) => 3 
  case CC_C((_,_), _, CC_B(_, _, _)) => 4 
  case CC_C((_,_), CC_F(), _) => 5 
  case CC_C(('x',_), _, _) => 6 
  case CC_C(_, CC_D(_, _, _), CC_B(_, _, _)) => 7 
}
}
// This is not matched: (CC_C Wildcard
//      (CC_E (Tuple Byte Int) Byte (T_B Byte (Tuple Byte Int)))
//      (CC_B Int
//            Byte
//            Boolean
//            (CC_B Int Int Boolean Wildcard Wildcard Wildcard (T_A Int Int))
//            Wildcard
//            Wildcard
//            (T_A Int Byte))
//      (T_A Boolean (T_B Char Int)))
// This is not matched: (CC_C Char (T_A Char))