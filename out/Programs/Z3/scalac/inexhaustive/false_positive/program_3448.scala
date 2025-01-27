package Program_14 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G](a: T_B[F, G], b: T_A[E, E], c: F) extends T_A[E, F]
case class CC_B[H](a: H, b: T_A[H, H]) extends T_A[H, (Byte,Int)]

val v_a: T_A[Int, (Byte,Int)] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_A(_, CC_A(_, _, _), _) => 2 
}
}
// This is not matched: (CC_A (Tuple Byte Int)
//      Int
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Int (Tuple Byte Int)))
// This is not matched: (CC_E T_A T_A Wildcard (T_B T_A T_A))