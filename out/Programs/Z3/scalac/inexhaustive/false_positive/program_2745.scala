package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean], b: T_A[C, C]) extends T_A[T_A[Char, C], C]
case class CC_B[E, D, F]() extends T_A[E, D]
case class CC_C(a: CC_B[Byte, Byte, Byte], b: T_A[Char, Boolean], c: T_A[Int, Int]) extends T_A[T_A[Char, CC_B[Boolean, Boolean, (Byte,Int)]], CC_B[Boolean, Boolean, (Byte,Int)]]

val v_a: T_A[T_A[Char, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_B()) => 1 
  case CC_A(_, _) => 2 
  case CC_A(CC_B(), CC_B()) => 3 
  case CC_A(CC_B(), _) => 4 
}
}
// This is not matched: (CC_B (T_A Char Int) Int Boolean (T_A (T_A Char Int) Int))
// This is not matched: (CC_A Wildcard
//      (Tuple Int
//             (CC_A (CC_B (CC_A Wildcard Wildcard T_A) T_A)
//                   (Tuple Wildcard Wildcard)
//                   T_A))
//      T_A)