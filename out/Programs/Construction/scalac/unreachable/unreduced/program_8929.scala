package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Boolean]]) extends T_A[T_B[T_A[Int]]]
case class CC_B() extends T_A[T_B[T_A[Int]]]
case class CC_C[C](a: T_B[C], b: T_B[C], c: C) extends T_B[C]
case class CC_D[D](a: (T_B[CC_B],T_B[CC_A])) extends T_B[D]

val v_a: T_B[T_A[T_B[T_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, CC_C(_, _, _), CC_A(_, _)), _, CC_A(_, _)) => 0 
  case CC_C(CC_C(_, CC_C(_, _, _), CC_A(_, _)), _, CC_B()) => 1 
  case CC_C(CC_C(_, CC_C(_, _, _), CC_B()), _, CC_A(_, _)) => 2 
  case CC_C(CC_C(_, CC_C(_, _, _), CC_B()), _, CC_B()) => 3 
  case CC_C(CC_C(_, CC_D(_), CC_A(_, _)), _, CC_A(_, _)) => 4 
  case CC_C(CC_C(_, CC_D(_), CC_A(_, _)), _, CC_B()) => 5 
  case CC_C(CC_C(_, CC_D(_), CC_B()), _, CC_A(_, _)) => 6 
  case CC_C(CC_C(_, CC_D(_), CC_B()), _, CC_B()) => 7 
  case CC_C(CC_D((_,_)), _, CC_A(_, _)) => 8 
  case CC_C(CC_D((_,_)), _, CC_B()) => 9 
  case CC_D(_) => 10 
}
}