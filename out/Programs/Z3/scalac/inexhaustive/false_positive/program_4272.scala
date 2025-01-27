package Program_15 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: (Byte,Byte)) extends T_A[E, F]
case class CC_B[H, G, I](a: T_A[H, G]) extends T_A[H, G]
case class CC_C[J](a: T_A[J, J]) extends T_A[J, T_B[J, J]]
case class CC_D[K](a: CC_C[K], b: (Char,Char)) extends T_B[K, CC_C[K]]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A((0,_)) => 1 
  case CC_A((_,0)) => 2 
  case CC_A((0,0)) => 3 
  case CC_B(_) => 4 
}
}
// This is not matched: (CC_B Boolean
//      Boolean
//      Boolean
//      (CC_B Boolean
//            Boolean
//            Boolean
//            (CC_B Boolean Boolean Boolean Wildcard (T_A Boolean Boolean))
//            (T_A Boolean Boolean))
//      (T_A Boolean Boolean))
// This is not matched: (CC_D Wildcard T_B)