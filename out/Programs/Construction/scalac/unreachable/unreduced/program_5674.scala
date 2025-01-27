package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_B, b: T_A[(Char,(Boolean,Boolean)), T_A[D, D]], c: Int) extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_D(a: T_A[T_A[(T_B,T_B), (T_B,T_B)], (T_B,T_B)], b: T_A[T_A[CC_A[T_B], CC_A[T_B]], CC_A[T_B]], c: CC_A[CC_B[(Char,Int)]]) extends T_B

val v_a: T_A[T_A[CC_D, CC_D], CC_D] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_D(_, _, _), _, _) => 1 
  case CC_C(CC_A()) => 2 
  case CC_C(CC_B(_, _, _)) => 3 
  case CC_C(CC_C(CC_A())) => 4 
  case CC_C(CC_C(CC_B(_, _, _))) => 5 
  case CC_C(CC_C(CC_C(_))) => 6 
}
}