package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C) extends T_A[D, C]
case class CC_B[E, F, G](a: (Int,Boolean), b: (Char,Int)) extends T_A[F, E]
case class CC_C[H](a: T_A[H, H], b: T_A[Boolean, H], c: H) extends T_A[CC_B[H, H, H], H]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_), _) => 1 
  case CC_B((_,_), ('x',_)) => 2 
  case CC_B((12,_), ('x',_)) => 3 
  case CC_B(_, (_,12)) => 4 
  case CC_B((12,_), _) => 5 
  case CC_B(_, _) => 6 
  case CC_B((12,_), ('x',12)) => 7 
  case CC_B((_,_), (_,12)) => 8 
  case CC_B((12,_), (_,12)) => 9 
  case CC_B((_,_), (_,_)) => 10 
  case CC_B(_, ('x',_)) => 11 
  case CC_B(_, (_,_)) => 12 
}
}
// This is not matched: (CC_B Boolean
//      Char
//      (CC_A Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      (T_A Char Boolean))
// This is not matched: (CC_B Int Boolean (T_A Boolean Int))