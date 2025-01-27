package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Boolean], b: T_B[Char], c: T_A[T_A[Char]]) extends T_A[T_B[T_B[Int]]]
case class CC_B[C](a: Int) extends T_A[T_B[T_B[Int]]]
case class CC_C() extends T_A[T_B[T_B[Int]]]
case class CC_D[D](a: T_A[D]) extends T_B[D]
case class CC_E[E](a: (CC_C,(CC_C,CC_C))) extends T_B[E]

val v_a: T_A[T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_), _) => 0 
  case CC_A(_, CC_E((_,_)), _) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: CC_C()