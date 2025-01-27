package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C]) extends T_A[T_A[Byte, C], C]

val v_a: T_A[T_A[Byte, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_B Wildcard (T_A T_B))