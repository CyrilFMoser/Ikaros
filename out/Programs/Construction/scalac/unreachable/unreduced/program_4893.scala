package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[Char], Int]
case class CC_B() extends T_A[T_B[Char], Int]
case class CC_C[D](a: D, b: D, c: T_B[D]) extends T_B[D]
case class CC_D[E](a: (CC_A,T_B[CC_B]), b: Char, c: T_A[E, E]) extends T_B[E]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(), CC_C(_, _, _)) => 0 
  case CC_C(_, CC_A(), CC_D((_,_), _, _)) => 1 
  case CC_D((CC_A(),CC_C(_, _, _)), _, _) => 2 
  case CC_D((CC_A(),CC_D(_, _, _)), _, _) => 3 
}
}