package Program_30 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: D, b: (Char,(Char,Byte)), c: T_A[E, C]) extends T_A[C, D]
case class CC_B[F](a: CC_A[F, F, F]) extends T_A[F, CC_A[Byte, Char, Char]]

val v_a: T_A[Int, CC_A[Byte, Char, Char]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_A(_, ('x',(_,_)), CC_A(_, _, _)) => 1 
  case CC_A(_, ('x',(_,_)), _) => 2 
  case CC_A(_, _, CC_A(_, _, _)) => 3 
  case CC_A(CC_A(_, _, _), (_,(_,_)), CC_A(_, _, _)) => 4 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 5 
  case CC_A(_, _, _) => 6 
  case CC_A(_, (_,(_,_)), _) => 7 
}
}
// This is not matched: (CC_A Int
//      (CC_A Byte Char Char Boolean Boolean Boolean (T_A Boolean Boolean))
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Int
//           (CC_A Byte Char Char Boolean Boolean Boolean (T_A Boolean Boolean))))
// This is not matched: (CC_A Int
//      (CC_A Byte Char Char Boolean Boolean Boolean (T_A Boolean Boolean))
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Int
//           (CC_A Byte Char Char Boolean Boolean Boolean (T_A Boolean Boolean))))