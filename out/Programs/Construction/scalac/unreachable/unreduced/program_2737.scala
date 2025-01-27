package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: E, b: T_A[E, E], c: T_B[E]) extends T_A[D, E]
case class CC_B[G, F, H](a: Int) extends T_A[G, F]
case class CC_C[J, I]() extends T_A[I, J]
case class CC_D() extends T_B[T_A[CC_C[Int, Int], (Int,Boolean)]]
case class CC_E() extends T_B[T_A[CC_C[Int, Int], (Int,Boolean)]]

val v_a: T_A[CC_E, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), CC_A(_, _, _), _) => 0 
  case CC_A(CC_D(), CC_B(_), _) => 1 
  case CC_A(CC_D(), CC_C(), _) => 2 
  case CC_B(_) => 3 
  case CC_C() => 4 
}
}