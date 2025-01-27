package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Int]], b: T_B[T_A[Char]], c: T_B[T_A[(Char,Boolean)]]) extends T_A[T_B[T_A[Int]]]
case class CC_B(a: CC_A, b: T_A[T_B[Boolean]], c: T_B[T_A[CC_A]]) extends T_A[T_B[T_A[Int]]]
case class CC_C[C](a: CC_A, b: (T_B[CC_A],CC_A)) extends T_B[C]
case class CC_D[D](a: T_A[D]) extends T_B[D]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_C(_, _), CC_C(_, _), CC_C(_, _)), (CC_C(_, _),CC_A(_, _, _))) => 0 
  case CC_C(CC_A(CC_D(_), CC_C(_, _), CC_C(_, _)), (CC_C(_, _),CC_A(_, _, _))) => 1 
  case CC_C(CC_A(CC_D(_), CC_C(_, _), CC_D(_)), (CC_C(_, _),CC_A(_, _, _))) => 2 
  case CC_C(CC_A(CC_C(_, _), CC_D(_), CC_C(_, _)), (CC_C(_, _),CC_A(_, _, _))) => 3 
  case CC_C(CC_A(CC_D(_), CC_D(_), CC_C(_, _)), (CC_C(_, _),CC_A(_, _, _))) => 4 
  case CC_C(CC_A(CC_C(_, _), CC_D(_), CC_D(_)), (CC_C(_, _),CC_A(_, _, _))) => 5 
  case CC_C(CC_A(CC_D(_), CC_D(_), CC_D(_)), (CC_C(_, _),CC_A(_, _, _))) => 6 
  case CC_C(CC_A(CC_C(_, _), CC_C(_, _), CC_C(_, _)), (CC_D(_),CC_A(_, _, _))) => 7 
  case CC_C(CC_A(CC_D(_), CC_C(_, _), CC_C(_, _)), (CC_D(_),CC_A(_, _, _))) => 8 
  case CC_C(CC_A(CC_C(_, _), CC_C(_, _), CC_D(_)), (CC_D(_),CC_A(_, _, _))) => 9 
  case CC_C(CC_A(CC_D(_), CC_C(_, _), CC_D(_)), (CC_D(_),CC_A(_, _, _))) => 10 
  case CC_C(CC_A(CC_C(_, _), CC_D(_), CC_C(_, _)), (CC_D(_),CC_A(_, _, _))) => 11 
  case CC_C(CC_A(CC_D(_), CC_D(_), CC_C(_, _)), (CC_D(_),CC_A(_, _, _))) => 12 
  case CC_C(CC_A(CC_C(_, _), CC_D(_), CC_D(_)), (CC_D(_),CC_A(_, _, _))) => 13 
  case CC_C(CC_A(CC_D(_), CC_D(_), CC_D(_)), (CC_D(_),CC_A(_, _, _))) => 14 
  case CC_D(_) => 15 
}
}
// This is not matched: CC_C(CC_A(CC_C(_, _), CC_C(_, _), CC_D(_)), (CC_C(_, _),CC_A(_, _, _)))