package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Int, b: D, c: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_C[E](a: CC_B[Byte], b: CC_A[E], c: CC_B[E]) extends T_A[T_A[CC_A[CC_A[Int]], CC_A[CC_A[Int]]], CC_A[CC_A[Int]]]

val v_a: T_A[T_A[CC_A[CC_A[Int]], CC_A[CC_A[Int]]], CC_A[CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(_, CC_A(_), _)) => 3 
  case CC_A(CC_C(CC_B(_, _, _), _, _)) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C(CC_B(_, _, _), _, _) => 6 
}
}