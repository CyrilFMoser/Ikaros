package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (Boolean,Byte)) extends T_A[C]
case class CC_B[D, E](a: D, b: T_B[E], c: T_A[D]) extends T_B[D]
case class CC_C(a: CC_A[Byte], b: T_A[Int]) extends T_B[Int]
case class CC_D(a: CC_A[(Int,Int)]) extends T_B[Int]

val v_a: T_B[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C(_, _), CC_A(_)) => 0 
  case CC_B(CC_C(_, _), CC_B(_, _, _), CC_A(_)) => 1 
  case CC_B(CC_B(_, _, _), _, CC_A(_)) => 2 
  case CC_B(CC_D(_), _, CC_A(_)) => 3 
  case CC_B(_, CC_B(_, _, _), CC_A(_)) => 4 
  case CC_B(CC_C(_, _), CC_D(_), CC_A(_)) => 5 
  case CC_B(CC_B(_, _, _), CC_C(_, _), CC_A(_)) => 6 
  case CC_B(_, CC_C(_, _), _) => 7 
  case CC_B(_, CC_D(_), _) => 8 
  case CC_B(_, CC_B(_, _, _), _) => 9 
  case CC_B(CC_C(_, _), CC_D(_), _) => 10 
  case CC_B(CC_C(_, _), _, CC_A(_)) => 11 
  case CC_B(_, CC_D(_), CC_A(_)) => 12 
}
}
// This is not matched: (CC_B (T_B Int)
//      Boolean
//      (CC_D (CC_A (Tuple Int Int) (Tuple Wildcard Byte) (T_A (Tuple Int Int)))
//            (T_B Int))
//      (CC_B Boolean Boolean Wildcard Wildcard Wildcard (T_B Boolean))
//      Wildcard
//      (T_B (T_B Int)))
// This is not matched: (CC_A Char Wildcard (T_A Char))