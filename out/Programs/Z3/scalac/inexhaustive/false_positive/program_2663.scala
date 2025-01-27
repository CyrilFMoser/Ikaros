package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[D, (Boolean,Boolean)], b: Char, c: T_A[E, E]) extends T_A[E, D]
case class CC_B[F](a: T_A[F, F]) extends T_A[T_A[Byte, Byte], F]
case class CC_C[G, H](a: Int, b: (Char,Int), c: (Byte,(Boolean,Byte))) extends T_B[G]
case class CC_D[I, J](a: Char) extends T_B[I]
case class CC_E[K]() extends T_B[K]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E() => 1 
  case CC_C(_, _, (_,(_,_))) => 2 
  case CC_C(12, _, (_,(_,_))) => 3 
  case CC_C(_, ('x',_), (_,(_,_))) => 4 
  case CC_C(12, (_,12), (0,(_,_))) => 5 
  case CC_C(12, _, _) => 6 
  case CC_C(12, ('x',12), (0,(_,_))) => 7 
  case CC_C(_, (_,_), (_,(_,_))) => 8 
  case CC_C(12, ('x',12), (_,(_,_))) => 9 
}
}
// This is not matched: (CC_C Byte Boolean Int Wildcard Wildcard (T_B Byte))
// This is not matched: (CC_C Byte Boolean Int Wildcard Wildcard (T_B Byte))