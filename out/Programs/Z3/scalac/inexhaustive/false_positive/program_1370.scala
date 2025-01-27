package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G](a: (Byte,Char), b: T_B[E, Byte], c: T_A[F, E]) extends T_A[E, F]
case class CC_B[I, H]() extends T_A[I, H]
case class CC_C[K, J](a: T_A[J, K]) extends T_B[K, J]
case class CC_D[M, L](a: L, b: CC_C[L, M]) extends T_B[M, L]
case class CC_E[O, N](a: CC_D[O, O], b: T_A[O, O], c: N) extends T_B[N, O]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A((_,_), _, CC_A(_, _, _)) => 1 
  case CC_A(_, CC_C(_), CC_A(_, _, _)) => 2 
  case CC_A(_, _, CC_A(_, _, _)) => 3 
  case CC_A(_, CC_D(_, _), CC_B()) => 4 
  case CC_A((0,'x'), CC_C(_), CC_B()) => 5 
  case CC_A((0,'x'), CC_C(_), _) => 6 
  case CC_A((0,_), CC_D(_, _), CC_A(_, _, _)) => 7 
  case CC_A((_,_), CC_D(_, _), _) => 8 
  case CC_A(_, _, CC_B()) => 9 
  case CC_A((_,'x'), CC_C(_), CC_B()) => 10 
  case CC_A((0,'x'), _, _) => 11 
  case CC_A((_,_), CC_C(_), CC_A(_, _, _)) => 12 
  case CC_A((_,_), CC_C(_), CC_B()) => 13 
  case CC_A((_,'x'), _, _) => 14 
  case CC_A((_,_), CC_E(_, _, _), CC_A(_, _, _)) => 15 
  case CC_A((0,_), CC_C(_), _) => 16 
  case CC_A((0,'x'), _, CC_A(_, _, _)) => 17 
  case CC_A((0,'x'), CC_E(_, _, _), CC_A(_, _, _)) => 18 
}
}
// This is not matched: (CC_A Byte Char Boolean (Tuple Byte Char) Wildcard Wildcard (T_A Byte Char))
// This is not matched: (CC_D T_B)