package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[D], D]
case class CC_B[E](a: T_A[T_B[E], E], b: T_B[E], c: T_A[E, E]) extends T_B[E]
case class CC_C[F]() extends T_B[F]
case class CC_D[G](a: CC_B[CC_B[G]], b: Char) extends T_B[G]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_B(_, _, _), _) => 0 
  case CC_B(CC_A(), CC_C(), _) => 1 
  case CC_B(CC_A(), CC_D(_, _), _) => 2 
  case CC_C() => 3 
  case CC_D(_, _) => 4 
}
}