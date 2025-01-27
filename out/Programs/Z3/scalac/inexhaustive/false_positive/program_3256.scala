package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[Char, Int]]
case class CC_B[E, D](a: (Int,CC_A)) extends T_B[D, E]

val v_a: CC_B[T_A[T_B[Char, Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_B((12,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants