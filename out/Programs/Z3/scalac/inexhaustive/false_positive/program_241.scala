package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[E, F]() extends T_A[E, F]
case class CC_C[H, G]() extends T_A[G, H]
case class CC_D(a: T_B[Int], b: T_A[Char, (Boolean,Char)], c: T_A[Int, Int]) extends T_B[CC_B[(Char,Boolean), Char]]

val v_a: T_B[CC_B[(Char,Boolean), Char]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_B (T_A Int Char) Char Wildcard Wildcard (T_A (T_A Int Char) Char))