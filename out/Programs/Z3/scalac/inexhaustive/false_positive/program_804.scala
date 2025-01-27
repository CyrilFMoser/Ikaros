package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: T_A[C, C]) extends T_A[C, T_A[Byte, Int]]
case class CC_B() extends T_A[T_A[Char, Char], T_A[Byte, Int]]
case class CC_C(a: (CC_B,CC_B)) extends T_A[T_A[Char, Char], T_A[Byte, Int]]

val v_a: T_A[T_A[Char, Char], T_A[Byte, Int]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: (CC_A (T_A Char Char)
//      Boolean
//      Wildcard
//      Wildcard
//      (T_A (T_A Char Char) (T_A Byte Int)))
// This is not matched: (CC_B (Tuple (CC_B Wildcard Wildcard Int T_A) Wildcard) Wildcard Wildcard T_A)