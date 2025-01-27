package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C]() extends T_B[T_B[C, C], C]
case class CC_C[D](a: D, b: T_B[T_B[D, D], D]) extends T_B[T_B[D, D], D]
case class CC_D[E](a: T_B[Boolean, E], b: T_B[T_B[E, E], E], c: E) extends T_B[T_B[E, E], E]

val v_a: T_B[T_B[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_C(_, _)) => 1 
  case CC_C(_, CC_D(_, _, _)) => 2 
  case CC_D(_, _, _) => 3 
}
}
// This is not matched: CC_C(_, CC_B())