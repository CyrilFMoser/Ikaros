package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: Boolean, b: T_A, c: T_A) extends T_A
case class CC_B(a: T_B[CC_A[T_A], CC_A[T_A]], b: CC_A[T_A], c: T_B[CC_A[T_A], T_A]) extends T_A
case class CC_C(a: ((Int,CC_B),CC_B), b: Boolean, c: CC_A[T_A]) extends T_A
case class CC_D[D](a: Char, b: T_A, c: CC_A[D]) extends T_B[D, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_, _, _))) => 1 
  case CC_A(_, _, CC_A(_, _, CC_C(_, _, _))) => 2 
  case CC_A(_, _, CC_B(_, CC_A(_, _, _), _)) => 3 
  case CC_A(_, _, CC_C(_, _, _)) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C(((_,_),CC_B(_, _, _)), _, _) => 6 
}
}