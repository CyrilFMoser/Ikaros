package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int, b: T_A[Int, Int]) extends T_A[Char, Char]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_E Boolean Wildcard (T_B Char Boolean))