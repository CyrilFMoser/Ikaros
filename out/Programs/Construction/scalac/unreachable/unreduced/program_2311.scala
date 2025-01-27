package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_B[(Byte,Boolean)], c: T_B[T_A[Boolean]]) extends T_A[T_A[T_B[Boolean]]]
case class CC_B(a: Int) extends T_A[T_A[T_B[Boolean]]]
case class CC_C(a: T_A[(CC_A,Char)]) extends T_A[T_A[T_B[Boolean]]]
case class CC_D[C](a: C) extends T_B[C]
case class CC_E[D]() extends T_B[D]

val v_a: T_A[T_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D((_,_)), CC_D(_)) => 0 
  case CC_A(_, CC_E(), CC_D(_)) => 1 
  case CC_A(_, CC_D((_,_)), CC_E()) => 2 
  case CC_A(_, CC_E(), CC_E()) => 3 
  case CC_B(_) => 4 
  case CC_C(_) => 5 
}
}