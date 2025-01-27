package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: ((Int,T_A),T_A), b: Boolean, c: T_A) extends T_A
case class CC_B(a: T_B[T_A, CC_A]) extends T_A
case class CC_C[C]() extends T_B[C, T_B[T_A, CC_A]]
case class CC_D[D](a: D) extends T_B[D, T_B[T_A, CC_A]]
case class CC_E[E](a: E) extends T_B[E, T_B[T_A, CC_A]]

val v_a: T_B[CC_A, T_B[T_A, CC_A]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A((_,_), _, CC_A(_, _, _))) => 0 
  case CC_D(CC_A((_,_), _, CC_B(_))) => 1 
  case CC_E(CC_A(_, _, _)) => 2 
}
}
// This is not matched: CC_C()