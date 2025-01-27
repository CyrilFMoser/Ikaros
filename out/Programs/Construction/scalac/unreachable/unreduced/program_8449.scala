package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_B(a: T_A[T_A[Byte]], b: Int, c: T_A[T_B[Int]]) extends T_A[T_A[T_B[Int]]]
case class CC_C(a: T_A[CC_B], b: CC_A[CC_A[Char]], c: CC_B) extends T_B[CC_B]

val v_a: T_A[T_A[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, CC_B(_, 12, CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _))) => 1 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _))) => 2 
  case CC_A(_, CC_A(_, _, CC_A(_, _, _)), CC_A(_, _, CC_B(_, _, _))) => 3 
  case CC_A(_, CC_A(_, _, CC_B(_, _, _)), CC_A(_, _, CC_B(_, _, _))) => 4 
  case CC_A(_, CC_B(_, 12, CC_A(_, _, _)), CC_A(_, _, CC_B(_, _, _))) => 5 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), CC_A(_, _, CC_B(_, _, _))) => 6 
  case CC_A(_, CC_A(_, _, CC_A(_, _, _)), CC_B(CC_A(_, _, _), _, CC_A(_, _, _))) => 7 
  case CC_A(_, CC_A(_, _, CC_B(_, _, _)), CC_B(CC_A(_, _, _), _, CC_A(_, _, _))) => 8 
  case CC_A(_, CC_B(_, 12, CC_A(_, _, _)), CC_B(CC_A(_, _, _), _, CC_A(_, _, _))) => 9 
  case CC_A(_, CC_B(_, _, CC_A(_, _, _)), CC_B(CC_A(_, _, _), _, CC_A(_, _, _))) => 10 
  case CC_B(_, _, _) => 11 
}
}
// This is not matched: CC_A(_, CC_A(_, _, CC_B(_, _, _)), CC_A(_, _, CC_A(_, _, _)))