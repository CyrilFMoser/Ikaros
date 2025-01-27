package Program_31 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E, F](a: T_A[D, F]) extends T_A[D, E]
case class CC_B[H, G](a: H, b: Int) extends T_A[G, H]
case class CC_C[I, J](a: I) extends T_A[I, J]
case class CC_D[K]() extends T_B[K]
case class CC_E() extends T_B[CC_A[Char, Int, Byte]]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_B('x', 12) => 1 
  case CC_B(_, 12) => 2 
  case CC_B(_, _) => 3 
  case CC_A(CC_B(_, _)) => 4 
  case CC_A(_) => 5 
  case CC_A(CC_A(_)) => 6 
}
}
// This is not matched: (CC_A Boolean
//      Char
//      (CC_E (T_A (T_A Boolean Boolean) Boolean))
//      (CC_C Boolean
//            (CC_E (T_A Boolean Boolean))
//            Wildcard
//            (T_A Boolean (CC_E (T_A Boolean Boolean))))
//      (T_A Boolean Char))
// This is not matched: (CC_B Byte Boolean Wildcard Wildcard (T_A (T_A Byte Int) Byte))