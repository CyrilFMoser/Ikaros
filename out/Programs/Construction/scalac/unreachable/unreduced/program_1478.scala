package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_A[Boolean], c: T_A[Boolean]) extends T_A[Boolean]
case class CC_B[C](a: Boolean, b: Boolean, c: (T_B[CC_A],T_A[CC_A])) extends T_B[C]
case class CC_C(a: CC_B[CC_B[CC_A]], b: CC_A, c: T_A[T_A[CC_A]]) extends T_B[T_A[T_A[CC_A]]]
case class CC_D(a: T_B[T_A[CC_A]], b: Char, c: T_A[Boolean]) extends T_B[T_A[T_A[CC_A]]]

val v_a: T_B[T_A[T_A[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, (_,_)) => 0 
  case CC_C(_, CC_A(_, _, _), _) => 1 
  case CC_D(_, _, _) => 2 
}
}