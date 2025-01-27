package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: T_A[D, C], c: C) extends T_A[D, C]
case class CC_B[E, F](a: E) extends T_A[E, F]

val v_a: CC_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}