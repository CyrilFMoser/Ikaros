package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[CC_A[T_A[Char, Boolean]], CC_A[T_A[Char, Boolean]]], CC_A[T_A[Char, Boolean]]]

val v_a: T_A[T_A[CC_A[T_A[Char, Boolean]], CC_A[T_A[Char, Boolean]]], CC_A[T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_B() => 1 
}
}