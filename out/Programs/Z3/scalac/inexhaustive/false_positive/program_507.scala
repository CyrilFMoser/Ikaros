package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B() extends T_A[Int, T_B[Byte, Char]]
case class CC_D[F, G](a: T_A[F, CC_B], b: F) extends T_B[F, G]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_D(_, 'x') => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Boolean Char))