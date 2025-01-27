package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D) extends T_A[C, Byte]
case class CC_B[E](a: T_A[E, E], b: Boolean, c: CC_A[E, E]) extends T_A[E, Byte]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}