package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: T_A[Char, E], b: (Int,Int)) extends T_A[E, T_A[(Int,Boolean), Byte]]

val v_a: T_A[Byte, T_A[(Int,Boolean), Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,12)) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)