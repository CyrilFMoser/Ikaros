package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_D[G](a: T_B[G, G], b: G) extends T_B[T_A[G], G]

val v_a: T_B[T_A[Char], Char] = null
val v_b: Int = v_a match{
  case CC_D(_, 'x') => 0 
}
}
// This is not matched: (CC_A Char (T_A Char))