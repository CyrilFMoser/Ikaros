package Program_15 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, T_A[D, D]]
case class CC_B(a: CC_A[(Char,Char), Int], b: T_B[Int], c: CC_A[Int, Int]) extends T_A[CC_A[Byte, Int], T_A[CC_A[Byte, Int], CC_A[Byte, Int]]]
case class CC_C[F, G]() extends T_A[G, F]
case class CC_D() extends T_B[T_A[Char, CC_B]]
case class CC_E[H](a: T_B[H], b: CC_B) extends T_B[H]
case class CC_F(a: T_A[Boolean, Char]) extends T_B[T_A[Char, CC_B]]

val v_a: T_A[CC_A[Byte, Int], T_A[CC_A[Byte, Int], CC_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A() => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(CC_A(), _, _) => 3 
}
}
// This is not matched: (CC_A (CC_A Byte Int Boolean)
//      Boolean
//      (T_A (CC_A Byte Int Boolean)
//           (T_A (CC_A Byte Int Boolean) (CC_A Byte Int Boolean))))
// This is not matched: (CC_D (CC_C Wildcard Wildcard T_B) T_B)