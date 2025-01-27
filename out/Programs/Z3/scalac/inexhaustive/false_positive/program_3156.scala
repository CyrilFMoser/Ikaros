package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_C[G](a: (Int,Int), b: T_B[G, G]) extends T_B[T_A[Int, Char], G]

val v_a: T_B[T_A[Int, Char], Boolean] = null
val v_b: Int = v_a match{
  case CC_C((12,_), _) => 0 
}
}
// This is not matched: (CC_B Char Wildcard Wildcard (T_A Char))