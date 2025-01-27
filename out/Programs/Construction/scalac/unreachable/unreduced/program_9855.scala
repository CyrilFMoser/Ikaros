package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte) extends T_A[T_A[T_B[Boolean]]]
case class CC_B[C](a: T_B[C], b: T_A[C], c: C) extends T_A[C]
case class CC_C() extends T_B[T_A[(CC_A,CC_A)]]

val v_a: T_A[T_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_B(_, _, _)) => 1 
  case CC_B(_, CC_B(_, CC_A(_), _), CC_B(_, _, _)) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), CC_B(_, _, _)) => 3 
}
}