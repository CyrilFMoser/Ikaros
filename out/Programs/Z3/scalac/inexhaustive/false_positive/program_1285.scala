package Program_30 

package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: D, b: T_A[E, E]) extends T_A[C, D]
case class CC_B[F, G](a: (Char,Char)) extends T_A[G, F]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(0, _) => 1 
  case CC_A(_, CC_B(_)) => 2 
  case CC_A(0, CC_A(_, _)) => 3 
  case CC_B(('x',_)) => 4 
  case CC_B(('x','x')) => 5 
  case CC_B((_,_)) => 6 
}
}
// This is not matched: (CC_A Int Byte Boolean Byte Wildcard (T_A Int Byte))
// This is not matched: (CC_C T_B T_B)