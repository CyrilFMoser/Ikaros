package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Char, C], b: (Int,Byte)) extends T_A[Char, C]
case class CC_B[E, D, F](a: (Boolean,Int)) extends T_A[D, E]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_B((_,12)) => 1 
  case CC_A(CC_A(_, _), (12,_)) => 2 
  case CC_A(_, (12,0)) => 3 
  case CC_A(CC_B(_), (_,_)) => 4 
  case CC_A(_, (12,_)) => 5 
  case CC_A(_, _) => 6 
  case CC_A(CC_B(_), (12,0)) => 7 
  case CC_A(_, (_,_)) => 8 
  case CC_A(CC_A(_, _), (12,0)) => 9 
  case CC_A(CC_A(_, _), (_,0)) => 10 
  case CC_A(CC_A(_, _), (_,_)) => 11 
}
}
// This is not matched: (CC_B Char Char (CC_A Boolean Boolean Boolean Boolean) Wildcard (T_A Char Char))
// This is not matched: (CC_A Char (T_A (T_A Boolean Int) Char))