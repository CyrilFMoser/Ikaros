package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Byte],Byte)) extends T_A[Boolean]
case class CC_B(a: T_B[T_B[CC_A]], b: CC_A, c: Int) extends T_A[Boolean]
case class CC_C[C](a: CC_A, b: Int, c: Byte) extends T_B[C]
case class CC_D[D](a: D, b: CC_B, c: T_A[Boolean]) extends T_B[D]
case class CC_E[E](a: CC_C[E], b: E, c: CC_D[E]) extends T_B[E]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_C(CC_A(_), 12, _), CC_A(_), _) => 1 
  case CC_B(CC_C(CC_A(_), _, _), CC_A(_), _) => 2 
  case CC_B(CC_D(CC_C(_, _, _), _, _), CC_A(_), _) => 3 
  case CC_B(CC_D(CC_D(_, _, _), _, _), CC_A(_), _) => 4 
  case CC_B(CC_D(CC_E(_, _, _), _, _), CC_A(_), _) => 5 
  case CC_B(CC_E(_, _, _), CC_A(_), _) => 6 
}
}