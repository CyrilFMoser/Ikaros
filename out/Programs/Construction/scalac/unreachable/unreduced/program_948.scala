package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), T_B[T_A, (Byte,Int)]], b: T_A) extends T_A
case class CC_B(a: T_B[CC_A, Int]) extends T_A
case class CC_C[C](a: C) extends T_A
case class CC_D[D](a: T_A, b: (T_A,CC_C[CC_B])) extends T_B[Boolean, D]
case class CC_E[E](a: E, b: T_B[Boolean, E]) extends T_B[Boolean, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_)) => 1 
  case CC_A(_, CC_C(_)) => 2 
  case CC_B(_) => 3 
  case CC_C(_) => 4 
}
}