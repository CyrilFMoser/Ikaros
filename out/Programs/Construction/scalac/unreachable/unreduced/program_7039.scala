package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[C, C], C], c: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_A[Char, Boolean], T_A[T_A[Char, Boolean], T_A[Char, Boolean]]]) extends T_A[CC_A[T_A[Int, Int]], T_A[CC_A[T_A[Int, Int]], CC_A[T_A[Int, Int]]]]
case class CC_C[D](a: T_A[D, T_A[D, D]], b: CC_A[D]) extends T_A[D, T_A[D, D]]

val v_a: T_A[CC_A[T_A[Int, Int]], T_A[CC_A[T_A[Int, Int]], CC_A[T_A[Int, Int]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_B(CC_C(CC_A(_, _, _), CC_A(_, _, _))) => 2 
  case CC_B(CC_C(CC_C(_, _), CC_A(_, _, _))) => 3 
  case CC_C(_, _) => 4 
}
}