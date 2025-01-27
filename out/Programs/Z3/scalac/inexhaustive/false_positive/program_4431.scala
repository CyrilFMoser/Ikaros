package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, E](a: (Boolean,Byte)) extends T_A[E, D]

val v_a: CC_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
}
}
// This is not matched: (CC_B Int (T_A Int Char))