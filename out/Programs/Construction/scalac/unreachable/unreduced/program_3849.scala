package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Int,T_A), b: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B[C](a: (T_A,T_B[T_A, T_A]), b: T_A) extends T_A
case class CC_C(a: (CC_A,Boolean), b: (CC_B[CC_A],T_B[Char, T_A]), c: CC_B[CC_B[T_A]]) extends T_A
case class CC_D[D](a: T_B[T_A, D], b: CC_B[D], c: T_A) extends T_B[T_A, D]
case class CC_E[E, F]() extends T_B[T_A, E]

val v_a: CC_D[CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A(_, CC_D(_, _, _))) => 0 
  case CC_D(_, _, CC_A(_, CC_E())) => 1 
  case CC_D(_, _, CC_B(_, _)) => 2 
  case CC_D(_, _, CC_C((_,_), (_,_), CC_B(_, _))) => 3 
}
}