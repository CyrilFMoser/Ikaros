package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (Char,Int), b: (Boolean,Byte)) extends T_A[T_B[T_A[Int]]]
case class CC_B(a: T_A[CC_A[Int]], b: T_A[Boolean], c: T_B[Char]) extends T_A[T_B[T_A[Char]]]
case class CC_C[D](a: D, b: CC_B, c: T_B[D]) extends T_B[D]
case class CC_D[E](a: E) extends T_B[E]
case class CC_E[F](a: CC_D[F], b: T_B[T_B[F]], c: (T_B[CC_B],T_B[CC_B])) extends T_B[F]

val v_a: T_B[T_A[T_B[T_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, _, CC_C(_, _, _)), _) => 0 
  case CC_C(_, CC_B(_, _, CC_D(_)), _) => 1 
  case CC_C(_, CC_B(_, _, CC_E(_, _, _)), _) => 2 
  case CC_D(CC_A(_, _)) => 3 
  case CC_E(CC_D(_), _, (CC_C(_, _, _),CC_C(_, _, _))) => 4 
  case CC_E(CC_D(_), _, (CC_C(_, _, _),CC_D(_))) => 5 
  case CC_E(CC_D(_), _, (CC_C(_, _, _),CC_E(_, _, _))) => 6 
  case CC_E(CC_D(_), _, (CC_D(_),CC_C(_, _, _))) => 7 
  case CC_E(CC_D(_), _, (CC_D(_),CC_D(_))) => 8 
  case CC_E(CC_D(_), _, (CC_D(_),CC_E(_, _, _))) => 9 
  case CC_E(CC_D(_), _, (CC_E(_, _, _),CC_C(_, _, _))) => 10 
  case CC_E(CC_D(_), _, (CC_E(_, _, _),CC_D(_))) => 11 
  case CC_E(CC_D(_), _, (CC_E(_, _, _),CC_E(_, _, _))) => 12 
}
}