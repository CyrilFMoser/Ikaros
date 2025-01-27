package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, E](a: D) extends T_A[E, D]

val v_a: CC_A[Char, T_A[T_B, T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants