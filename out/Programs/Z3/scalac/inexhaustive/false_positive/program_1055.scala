package Program_30 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: Int) extends T_A[D]
case class CC_B[E](a: Int, b: (Int,Boolean), c: CC_A[E]) extends T_A[E]
case class CC_C[F, G](a: F, b: Char, c: T_A[F]) extends T_B[Char, F]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _), _) => 0 
  case CC_B(12, (12,_), CC_A(_, _)) => 1 
  case CC_B(12, (_,_), CC_A(_, _)) => 2 
  case CC_B(12, _, CC_A(_, _)) => 3 
  case CC_B(12, _, _) => 4 
  case CC_B(12, (_,_), _) => 5 
  case CC_B(_, (_,_), _) => 6 
}
}
// This is not matched: (CC_A Char
//      (CC_C Char Boolean Char Wildcard Wildcard (T_B Char Char))
//      Wildcard
//      (T_A Char))
// This is not matched: (CC_A Wildcard (T_A Char (T_A (Tuple Char Int) Boolean)))