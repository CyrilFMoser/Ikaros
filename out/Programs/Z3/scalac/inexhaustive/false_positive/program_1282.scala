package Program_30 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: Int) extends T_A[E, T_A[Byte, Int]]
case class CC_B[G, F, H](a: G, b: G) extends T_A[F, G]
case class CC_C(a: T_A[Int, Byte]) extends T_A[T_A[Boolean, Int], T_A[Byte, Int]]

val v_a: T_A[Byte, T_A[Byte, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_A(0, _) => 1 
  case CC_A(0, 12) => 2 
  case CC_A(_, _) => 3 
  case CC_B(CC_B(_, _), _) => 4 
  case CC_B(_, _) => 5 
  case CC_B(CC_B(_, _), CC_B(_, _)) => 6 
}
}
// This is not matched: (CC_B (T_A Byte Int)
//      Byte
//      (T_B Boolean Boolean)
//      Wildcard
//      Wildcard
//      (T_A Byte (T_A Byte Int)))
// This is not matched: (CC_E Wildcard Wildcard Wildcard (T_B (T_B Int)))