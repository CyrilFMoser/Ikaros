package Program_31 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, E], b: T_B[F, E], c: T_B[Char, E]) extends T_A[F, E]
case class CC_B[G, H, I](a: (Int,Byte), b: (Byte,Byte), c: G) extends T_A[H, G]
case class CC_C[J, K](a: J, b: T_B[J, J]) extends T_B[J, K]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B((12,0), (_,0), _) => 0 
  case CC_B((12,_), _, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B((12,_), (0,0), 12) => 3 
  case CC_B((12,_), (_,0), _) => 4 
  case CC_B((_,0), (_,0), _) => 5 
  case CC_B((_,0), _, 12) => 6 
  case CC_B(_, (_,_), _) => 7 
  case CC_B(_, (0,_), _) => 8 
  case CC_B((_,_), (_,_), _) => 9 
  case CC_A(_, _, CC_C(_, _)) => 10 
}
}
// This is not matched: (CC_B Int Boolean Boolean Wildcard Wildcard Wildcard (T_A Boolean Int))
// This is not matched: (CC_C Wildcard Wildcard T_A)