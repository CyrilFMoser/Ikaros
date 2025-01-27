package Program_15 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D, c: Byte) extends T_A[D]
case class CC_B[E, F](a: T_B[E, Int], b: (Boolean,Int)) extends T_A[E]
case class CC_C[G, H](a: T_A[G], b: ((Boolean,Char),Char)) extends T_B[G, H]
case class CC_D[I, J](a: J, b: CC_C[I, J]) extends T_B[I, J]
case class CC_E[K, L](a: CC_C[Char, Int], b: T_A[L], c: T_B[K, K]) extends T_B[K, L]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), 12, 0) => 0 
  case CC_A(CC_B(_, _), _, _) => 1 
  case CC_A(_, _, _) => 2 
  case CC_A(_, 12, _) => 3 
  case CC_A(_, 12, 0) => 4 
  case CC_A(CC_B(_, _), 12, _) => 5 
  case CC_B(CC_E(_, _, _), (_,_)) => 6 
  case CC_B(_, _) => 7 
  case CC_B(_, (_,_)) => 8 
  case CC_B(CC_C(_, _), (_,_)) => 9 
  case CC_B(CC_D(_, _), (_,_)) => 10 
  case CC_B(CC_D(_, _), _) => 11 
  case CC_B(CC_C(_, _), _) => 12 
  case CC_B(CC_D(_, _), (_,12)) => 13 
  case CC_B(CC_E(_, _, _), _) => 14 
}
}
// This is not matched: (CC_B Int Boolean Wildcard Wildcard (T_A Int))
// This is not matched: (CC_A (CC_B Byte T_A)
//      (Tuple (CC_A Wildcard Wildcard (CC_B Wildcard T_A) T_A) Wildcard)
//      Wildcard
//      T_A)