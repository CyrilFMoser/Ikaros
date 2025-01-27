package Program_29 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: E, b: E, c: T_B[E, E]) extends T_A[F, E]
case class CC_B[G, H](a: CC_A[G, Boolean], b: (Boolean,Byte)) extends T_A[G, H]
case class CC_C[I, J, K](a: T_A[I, Int]) extends T_A[I, J]
case class CC_D[L, M](a: CC_A[M, M], b: CC_A[L, L], c: T_A[L, Byte]) extends T_B[L, (Int,Byte)]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, (_,_)) => 1 
  case CC_B(_, (_,0)) => 2 
  case CC_B(CC_A(_, _, _), (_,_)) => 3 
  case CC_C(_) => 4 
}
}
// This is not matched: (CC_C Char
//      Char
//      (CC_A Boolean Boolean Boolean Boolean Boolean Boolean)
//      (CC_A Int Char Wildcard Wildcard Wildcard (T_A Char Int))
//      (T_A Char Char))
// This is not matched: (CC_B Int Byte (T_A Int Byte))