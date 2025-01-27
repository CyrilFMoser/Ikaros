package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D]) extends T_A[D, Boolean]
case class CC_C[E](a: T_B) extends T_A[T_A[E, E], E]
case class CC_D(a: Char, b: T_A[T_A[CC_B[T_B], CC_B[T_B]], CC_B[T_B]], c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D('x', CC_A(_), CC_D(_, _, _)) => 0 
  case CC_D(_, CC_A(_), CC_D(_, _, _)) => 1 
  case CC_D('x', CC_C(_), CC_D(_, _, _)) => 2 
  case CC_D(_, CC_C(_), CC_D(_, _, _)) => 3 
}
}