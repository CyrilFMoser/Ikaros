package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,Int)) extends T_A[C, Int]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: Pattern match is empty without constants