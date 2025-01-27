package Program_30 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[Char, E], b: (Int,Int)) extends T_A[E, T_A[(Int,Boolean), Byte]]

val v_a: T_A[Byte, T_A[(Int,Boolean), Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_A(_, (12,_)) => 1 
  case CC_A(_, _) => 2 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard (T_A Byte (T_A (Tuple Int Boolean) Byte)))
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)