package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D) extends T_A[D, C]
case class CC_B[F, E](a: F) extends T_A[E, F]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}