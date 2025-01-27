package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: E, b: (Int,Int)) extends T_A[E, F]
case class CC_B[G, H](a: T_B[G, G]) extends T_A[G, H]
case class CC_C[I, J, K](a: T_A[K, J]) extends T_A[J, I]
case class CC_D[M, L](a: T_A[M, L], b: L, c: CC_C[M, M, M]) extends T_B[L, M]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(_, (_,12)) => 1 
  case CC_A(0, (_,_)) => 2 
  case CC_A(_, (12,12)) => 3 
  case CC_B(_) => 4 
  case CC_C(_) => 5 
  case CC_C(CC_A(_, _)) => 6 
}
}
// This is not matched: (CC_C Char
//      Byte
//      Boolean
//      (CC_B Boolean Byte Wildcard (T_A Boolean Byte))
//      (T_A Byte Char))
// This is not matched: (CC_A Boolean Wildcard (CC_C Boolean (T_A Boolean)) (T_A Boolean))