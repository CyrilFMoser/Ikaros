package Program_13 

package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, Int]) extends T_A[T_A[E, E], E]
case class CC_B[F]() extends T_A[T_A[F, F], F]
case class CC_C(a: CC_A[Int], b: T_B[Boolean, Char], c: CC_A[Int]) extends T_B[CC_B[Int], CC_B[Char]]
case class CC_D[G](a: T_B[G, G]) extends T_B[CC_B[Int], CC_B[Char]]
case class CC_E[H](a: CC_A[H], b: (CC_C,(Char,Byte)), c: H) extends T_B[CC_D[CC_C], CC_C]

val v_a: T_B[CC_D[CC_C], CC_C] = null
val v_b: Int = v_a match{
  case CC_E(_, (CC_C(_, _, _),(_,_)), _) => 0 
  case CC_E(CC_A(_, _), _, _) => 1 
}
}
// This is not matched: (CC_E Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (CC_D (CC_C Boolean Boolean Boolean Boolean) Boolean Boolean)
//           (CC_C Boolean Boolean Boolean Boolean)))
// This is not matched: (CC_E Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (CC_D (CC_C Boolean Boolean Boolean Boolean) Boolean Boolean)
//           (CC_C Boolean Boolean Boolean Boolean)))