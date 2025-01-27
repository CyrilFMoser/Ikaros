package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E, F](a: T_A[E], b: (Byte,Byte)) extends T_B[E]
case class CC_D[G]() extends T_B[G]
case class CC_E() extends T_B[CC_B[Char]]

val v_a: T_B[CC_E] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C(CC_A(_), _) => 1 
  case CC_C(CC_B(), (0,_)) => 2 
  case CC_C(_, (_,_)) => 3 
  case CC_C(CC_B(), (_,0)) => 4 
  case CC_C(_, (_,0)) => 5 
  case CC_C(_, (0,0)) => 6 
  case CC_C(CC_B(), (_,_)) => 7 
  case CC_C(CC_A(_), (_,0)) => 8 
  case CC_C(_, (0,_)) => 9 
}
}
// This is not matched: (CC_C (CC_E (T_A Boolean)) Boolean Wildcard Wildcard (T_B (CC_E (T_A Boolean))))
// This is not matched: Pattern match is empty without constants