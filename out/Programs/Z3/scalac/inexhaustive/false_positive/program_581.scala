package Program_30 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Char, Byte], b: T_A[Char, Boolean]) extends T_A[(Boolean,Int), T_B[Int, Int]]
case class CC_B[E, F]() extends T_A[F, E]
case class CC_C[H, G, I]() extends T_A[G, H]
case class CC_D[J](a: T_A[J, J]) extends T_B[T_B[J, J], J]
case class CC_E(a: CC_A, b: CC_A, c: T_A[(Byte,Byte), Boolean]) extends T_B[T_B[Int, Int], Int]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_, _), CC_A(_, _), CC_C()) => 0 
  case CC_E(CC_A(_, _), _, CC_C()) => 1 
  case CC_E(_, CC_A(_, _), CC_C()) => 2 
  case CC_E(CC_A(_, _), CC_A(_, _), CC_B()) => 3 
  case CC_E(_, CC_A(_, _), CC_B()) => 4 
}
}
// This is not matched: (CC_E Wildcard
//      Wildcard
//      (CC_C Boolean
//            (Tuple Byte Byte)
//            (CC_B (T_A (T_A Boolean Boolean) Boolean) Boolean Boolean)
//            (T_A (Tuple Byte Byte) Boolean))
//      (T_B (T_B Int Int) Int))
// This is not matched: (CC_B Wildcard T_A)