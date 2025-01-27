package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int) extends T_A[C]
case class CC_B(a: T_A[CC_A[Int]]) extends T_A[T_A[CC_A[Boolean]]]
case class CC_C(a: (T_A[CC_B],Byte), b: Boolean, c: T_A[T_A[CC_B]]) extends T_B[CC_A[T_A[CC_B]]]
case class CC_D(a: T_B[T_A[CC_C]], b: CC_A[CC_A[Byte]], c: T_B[CC_C]) extends T_B[CC_A[T_A[CC_B]]]
case class CC_E() extends T_B[CC_A[T_A[CC_B]]]

val v_a: T_B[CC_A[T_A[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(12), _) => 0 
  case CC_D(_, CC_A(_), _) => 1 
  case CC_E() => 2 
}
}
// This is not matched: CC_C((CC_A(_),_), _, CC_A(_))