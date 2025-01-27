package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int, b: T_A[C], c: (Int,(Char,Byte))) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E, F]() extends T_A[E]
case class CC_D[G](a: T_A[G], b: CC_A[G]) extends T_B[Int]
case class CC_E() extends T_B[Int]
case class CC_F(a: T_A[CC_E], b: T_A[CC_E], c: Boolean) extends T_B[Int]

val v_a: CC_F = null
val v_b: Int = v_a match{
  case CC_F(CC_A(_, _, _), CC_A(_, _, _), _) => 0 
  case CC_F(CC_C(), _, _) => 1 
  case CC_F(_, CC_C(), _) => 2 
  case CC_F(CC_A(_, _, _), CC_B(), _) => 3 
  case CC_F(CC_B(), _, _) => 4 
}
}
// This is not matched: (CC_F (CC_C (CC_E Wildcard) (T_A Boolean) (T_A (CC_E Wildcard)))
//      (CC_C (CC_E Wildcard) (T_B Boolean) (T_A (CC_E Wildcard)))
//      Wildcard
//      (T_B Int))
// This is not matched: (CC_F (CC_B (CC_E Wildcard) (T_A (CC_E Wildcard))) Wildcard Wildcard (T_B Int))