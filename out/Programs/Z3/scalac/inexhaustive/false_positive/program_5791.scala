package Program_15 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char, b: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[E, F](a: (Int,Int), b: T_A[F, E], c: T_A[F, F]) extends T_A[E, F]
case class CC_C[G, H](a: CC_B[G, H], b: T_A[H, G]) extends T_B[G]
case class CC_D(a: CC_A[Byte], b: Char, c: (Char,(Char,Char))) extends T_B[CC_C[Char, Int]]
case class CC_E(a: CC_B[CC_D, CC_D], b: (CC_D,Char), c: T_A[Int, CC_D]) extends T_B[CC_D]

val v_a: T_B[CC_D] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), CC_B(_, _, _)) => 0 
  case CC_C(CC_B(_, _, _), _) => 1 
  case CC_E(_, (CC_D(_, _, _),_), _) => 2 
  case CC_E(CC_B(_, _, _), _, CC_B(_, _, _)) => 3 
  case CC_E(CC_B(_, _, _), (CC_D(_, _, _),'x'), _) => 4 
  case CC_E(_, (CC_D(_, _, _),'x'), CC_B(_, _, _)) => 5 
  case CC_E(CC_B(_, _, _), (CC_D(_, _, _),_), _) => 6 
  case CC_E(_, _, CC_B(_, _, _)) => 7 
  case CC_E(CC_B(_, _, _), _, _) => 8 
}
}
// This is not matched: (CC_C (CC_D (T_A Boolean Boolean) Boolean Boolean Boolean)
//      Boolean
//      Wildcard
//      Wildcard
//      (T_B (CC_D (T_A Boolean Boolean) Boolean Boolean Boolean)))
// This is not matched: (CC_C (CC_E (T_B Boolean (T_A Boolean)))
//      Wildcard
//      (T_A (CC_E (T_B Boolean (T_A Boolean)))))