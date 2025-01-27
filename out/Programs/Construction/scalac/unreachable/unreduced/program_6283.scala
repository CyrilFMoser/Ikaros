package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: D) extends T_A[C]
case class CC_B[E]() extends T_B[T_A[T_A[Boolean]]]
case class CC_C(a: T_B[T_A[Int]], b: Char, c: T_A[CC_B[Boolean]]) extends T_B[T_A[T_A[Boolean]]]
case class CC_D(a: T_A[CC_A[CC_C, CC_C]], b: CC_C) extends T_B[T_A[T_A[Boolean]]]

val v_a: T_B[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, CC_A(_)) => 1 
  case CC_D(CC_A(_), CC_C(_, _, _)) => 2 
}
}