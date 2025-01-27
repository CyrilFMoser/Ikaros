package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[CC_A[Boolean], CC_A[Boolean]], CC_A[Boolean]]
case class CC_C[D]() extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[T_A[T_A[CC_A[Boolean], CC_A[Boolean]], CC_A[Boolean]], T_A[T_A[CC_A[Boolean], CC_A[Boolean]], CC_A[Boolean]]], T_A[T_A[CC_A[Boolean], CC_A[Boolean]], CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_C()) => 1 
  case CC_C() => 2 
}
}