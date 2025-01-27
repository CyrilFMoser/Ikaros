package Program_30 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: D, b: T_B[E], c: (Int,Byte)) extends T_A[D, E]
case class CC_B[F](a: F) extends T_A[F, T_B[Byte]]
case class CC_C[G, H](a: CC_B[H], b: Int, c: H) extends T_A[G, T_B[Byte]]
case class CC_D(a: T_A[Boolean, Char]) extends T_B[T_B[Char]]
case class CC_E(a: (CC_D,CC_D), b: CC_C[CC_D, CC_D], c: Boolean) extends T_B[T_B[Char]]
case class CC_F[I](a: CC_C[I, CC_D]) extends T_B[I]

val v_a: T_A[Byte, T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_B(_), _, _) => 1 
  case CC_C(_, 12, _) => 2 
  case CC_A(0, CC_F(_), _) => 3 
  case CC_A(0, _, (12,_)) => 4 
  case CC_A(_, _, _) => 5 
  case CC_A(0, CC_F(_), (12,_)) => 6 
  case CC_A(_, CC_F(_), (12,0)) => 7 
  case CC_A(0, CC_F(_), (_,_)) => 8 
  case CC_A(0, _, _) => 9 
  case CC_A(0, CC_F(_), (12,0)) => 10 
  case CC_A(_, _, (_,_)) => 11 
  case CC_A(_, CC_F(_), (12,_)) => 12 
  case CC_A(_, CC_F(_), _) => 13 
  case CC_A(_, _, (_,0)) => 14 
  case CC_A(_, _, (12,0)) => 15 
  case CC_A(0, CC_F(_), (_,0)) => 16 
  case CC_A(_, CC_F(_), (_,0)) => 17 
  case CC_A(_, _, (12,_)) => 18 
  case CC_A(_, CC_F(_), (_,_)) => 19 
}
}
// This is not matched: (CC_C Byte
//      Boolean
//      (CC_B Boolean Boolean (T_A Boolean (T_B Byte)))
//      Int
//      Boolean
//      (T_A Byte (T_B Byte)))
// This is not matched: (CC_A (T_A Int) (Tuple Wildcard Wildcard) Wildcard (T_A (T_A Int)))