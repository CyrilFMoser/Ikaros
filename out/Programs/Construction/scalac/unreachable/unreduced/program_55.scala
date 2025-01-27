package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, T_B]) extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[D, T_B]
case class CC_C() extends T_B
case class CC_D[E](a: CC_B[E], b: E, c: Int) extends T_B
case class CC_E(a: T_A[T_A[CC_C, T_B], T_B], b: (T_A[T_B, T_B],CC_B[CC_C])) extends T_B

val v_a: T_A[Int, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), CC_A(_, _)) => 0 
  case CC_A(CC_D(_, _, _), CC_A(_, _)) => 1 
  case CC_A(CC_E(_, _), CC_A(_, _)) => 2 
  case CC_A(CC_C(), CC_B(_, _)) => 3 
  case CC_A(CC_D(_, _, _), CC_B(_, _)) => 4 
  case CC_A(CC_E(_, _), CC_B(_, _)) => 5 
  case CC_B(_, _) => 6 
}
}