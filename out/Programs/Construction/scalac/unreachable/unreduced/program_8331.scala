package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_B[Int]], c: (Byte,T_A[Boolean])) extends T_A[T_B[T_B[Char]]]
case class CC_B[C](a: C, b: Int) extends T_A[C]
case class CC_C(a: T_A[T_B[CC_A]], b: CC_A, c: Int) extends T_B[T_A[T_B[CC_A]]]
case class CC_D(a: T_A[T_A[CC_C]], b: T_B[T_A[CC_A]], c: CC_B[CC_B[CC_C]]) extends T_B[T_A[T_B[CC_A]]]
case class CC_E() extends T_B[T_A[T_B[CC_A]]]

val v_a: T_B[T_A[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_B(CC_B(_, _), _), _, _) => 1 
}
}
// This is not matched: CC_E()