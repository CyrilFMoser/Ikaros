package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_B[B], b: T_B[B], c: T_A) extends T_A
case class CC_B[C](a: C, b: Char, c: T_A) extends T_A
case class CC_C(a: CC_A[CC_B[T_A]], b: Int, c: Boolean) extends T_B[CC_A[T_B[T_A]]]
case class CC_D(a: CC_C) extends T_B[CC_A[T_B[T_A]]]
case class CC_E() extends T_B[CC_A[T_B[T_A]]]

val v_a: T_B[CC_A[T_B[T_A]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, CC_A(_, _, _)), _, _) => 0 
  case CC_C(CC_A(_, _, CC_B(_, _, _)), _, _) => 1 
  case CC_D(CC_C(_, _, true)) => 2 
  case CC_D(CC_C(_, _, false)) => 3 
  case CC_E() => 4 
}
}