package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: T_A[CC_B[E]], b: E, c: (CC_B[(Int,Byte)],T_A[Boolean])) extends T_A[E]
case class CC_D() extends T_B[T_A[CC_A[Boolean]]]
case class CC_E() extends T_B[T_A[CC_A[Boolean]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_), _, (CC_B(),CC_A(_))) => 2 
  case CC_C(CC_A(_), _, (CC_B(),CC_B())) => 3 
  case CC_C(CC_A(_), _, (CC_B(),CC_C(_, _, _))) => 4 
  case CC_C(CC_B(), _, (CC_B(),CC_A(_))) => 5 
  case CC_C(CC_B(), _, (CC_B(),CC_B())) => 6 
  case CC_C(CC_B(), _, (CC_B(),CC_C(_, _, _))) => 7 
  case CC_C(CC_C(_, _, _), _, (CC_B(),CC_A(_))) => 8 
  case CC_C(CC_C(_, _, _), _, (CC_B(),CC_B())) => 9 
  case CC_C(CC_C(_, _, _), _, (CC_B(),CC_C(_, _, _))) => 10 
}
}