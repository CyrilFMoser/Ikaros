package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean]) extends T_A[C, Boolean]
case class CC_B[D](a: (T_A[Char, Char],(Byte,Int))) extends T_A[D, Boolean]
case class CC_C[E]() extends T_A[E, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_B((_,(_,_))) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)