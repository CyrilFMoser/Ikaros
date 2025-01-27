package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[B], c: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: D, b: T_A[D], c: T_A[C]) extends T_A[C]
case class CC_C(a: CC_B[Byte, Byte]) extends T_A[T_A[Int]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(12, _, CC_B(_, _, _)) => 1 
  case CC_A(12, CC_B(_, _, _), _) => 2 
  case CC_A(12, _, CC_A(_, _, _)) => 3 
  case CC_A(_, CC_A(_, _, _), _) => 4 
  case CC_A(12, CC_A(_, _, _), _) => 5 
  case CC_A(12, CC_B(_, _, _), CC_A(_, _, _)) => 6 
  case CC_A(12, CC_A(_, _, _), CC_A(_, _, _)) => 7 
  case CC_A(_, CC_B(_, _, _), CC_B(_, _, _)) => 8 
  case CC_B(_, _, CC_B(_, _, _)) => 9 
  case CC_B(_, _, _) => 10 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 11 
  case CC_B(_, CC_C(_), CC_A(_, _, _)) => 12 
  case CC_B(_, CC_C(_), CC_B(_, _, _)) => 13 
}
}
// This is not matched: (CC_B Int (T_A Boolean) Wildcard Wildcard Wildcard (T_A Int))
// This is not matched: (CC_D (CC_B Char Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      (CC_C (CC_A Int Wildcard Wildcard (T_A Int (T_A Byte Int)))
//            (T_B (CC_B Char Boolean Boolean Boolean)))
//      (T_B (CC_B Char Boolean Boolean Boolean)))