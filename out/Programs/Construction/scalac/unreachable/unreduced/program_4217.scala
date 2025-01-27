package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, (T_A,T_A)]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: C, b: T_A) extends T_B[C, (T_A,T_A)]
case class CC_D[D, E](a: E, b: E, c: T_B[D, D]) extends T_B[D, (T_A,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _)) => 0 
  case CC_A(CC_D(_, _, _)) => 1 
  case CC_B(CC_A(CC_C(_, _))) => 2 
  case CC_B(CC_A(CC_D(_, _, _))) => 3 
  case CC_B(CC_B(CC_A(_))) => 4 
  case CC_B(CC_B(CC_B(_))) => 5 
}
}