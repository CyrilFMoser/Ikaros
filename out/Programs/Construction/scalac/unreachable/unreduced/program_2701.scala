package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_A, b: T_A, c: Int) extends T_A
case class CC_B(a: Int, b: (CC_A[T_A],T_A), c: Int) extends T_B[(T_A,T_B[T_A])]
case class CC_C(a: T_B[T_B[T_A]], b: T_A, c: T_B[T_B[T_A]]) extends T_B[(T_A,T_B[T_A])]

val v_a: T_B[(T_A,T_B[T_A])] = null
val v_b: Int = v_a match{
  case CC_B(_, (CC_A(_, _, _),CC_A(_, _, _)), _) => 0 
  case CC_C(_, _, _) => 1 
}
}