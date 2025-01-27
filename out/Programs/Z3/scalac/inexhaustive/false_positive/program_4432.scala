package Program_15 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[Int], c: T_B) extends T_A[Int]
case class CC_B[B, C](a: T_B) extends T_A[B]
case class CC_C[D](a: D, b: CC_A, c: CC_A) extends T_A[D]
case class CC_D(a: T_A[T_B], b: CC_C[(Char,Boolean)]) extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_D(_, _)) => 0 
  case CC_C(12, _, _) => 1 
  case CC_C(12, _, CC_A(_, _, _)) => 2 
  case CC_C(_, CC_A(_, _, _), CC_A(_, _, _)) => 3 
  case CC_A(CC_D(_, _), CC_A(_, _, _), _) => 4 
  case CC_A(_, CC_B(_), _) => 5 
  case CC_A(CC_D(_, _), CC_B(_), _) => 6 
  case CC_A(CC_D(_, _), CC_C(_, _, _), _) => 7 
  case CC_A(_, _, CC_D(_, _)) => 8 
  case CC_A(_, CC_A(_, _, _), CC_D(_, _)) => 9 
  case CC_A(CC_D(_, _), _, CC_D(_, _)) => 10 
  case CC_A(_, CC_B(_), CC_D(_, _)) => 11 
}
}
// This is not matched: (CC_B Int (CC_A T_B T_B T_B T_B) Wildcard (T_A Int))
// This is not matched: (CC_B (T_A (Tuple Char Char) Int)
//      (T_A Int Int)
//      Wildcard
//      Wildcard
//      (T_A (T_A Int Int) (T_A (Tuple Char Char) Int)))