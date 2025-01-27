package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Boolean], b: T_B[Int]) extends T_A[T_B[Boolean]]
case class CC_B(a: CC_A, b: T_B[T_A[CC_A]], c: T_A[T_A[CC_A]]) extends T_B[T_A[CC_A]]
case class CC_C[C](a: T_B[C]) extends T_B[C]
case class CC_D[D](a: (T_B[CC_A],Char)) extends T_B[D]

val v_a: T_B[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_B(_, _, _), _) => 0 
  case CC_B(CC_A(_, _), CC_C(CC_B(_, _, _)), _) => 1 
  case CC_B(CC_A(_, _), CC_C(CC_C(_)), _) => 2 
  case CC_B(CC_A(_, _), CC_C(CC_D(_)), _) => 3 
  case CC_B(CC_A(_, _), CC_D((_,_)), _) => 4 
  case CC_C(CC_B(CC_A(_, _), CC_B(_, _, _), _)) => 5 
  case CC_C(CC_B(CC_A(_, _), CC_C(_), _)) => 6 
  case CC_C(CC_B(CC_A(_, _), CC_D(_), _)) => 7 
  case CC_C(CC_C(_)) => 8 
  case CC_C(CC_D((_,_))) => 9 
  case CC_D((CC_C(_),_)) => 10 
  case CC_D((CC_D(_),_)) => 11 
}
}