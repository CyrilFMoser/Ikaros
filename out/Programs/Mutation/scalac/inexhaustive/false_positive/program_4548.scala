package Program_26 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: ((Int,Byte),T_B), b: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B[E, D]() extends T_A[D, E]
case class CC_C[F, G](a: T_A[T_B, F], b: G, c: T_A[G, F]) extends T_A[T_B, F]
case class CC_D() extends T_B
case class CC_E(a: T_A[T_B, T_B], b: CC_C[CC_D, T_B]) extends T_B

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),CC_D()), CC_A(_, _)) => 0 
  case CC_A(((_,_),CC_E(CC_C(_, _, _), _)), _) => 1 
  case CC_A(((_,_),CC_E(CC_B(), _)), _) => 1 
  case CC_A(((_,_),CC_E(CC_A(_, _), _)), _) => 1 
  case CC_A(((_,_),CC_D()), CC_B()) => 2 
}
}
// This is not matched: (CC_A Int
//      (Tuple Wildcard (CC_D T_B))
//      (CC_C Int
//            T_B
//            (CC_B Int T_B (T_A T_B Int))
//            Wildcard
//            Wildcard
//            (T_A T_B Int))
//      (T_A T_B Int))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _)
//  CC_B()
//  CC_C(_, _, _)
// }
//
// This is not matched: (CC_A T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A()
//  CC_B(_, _)
// }
//