package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_B[T_B[T_A, T_A], Int], c: (T_B[(Char,Boolean), T_A],T_B[T_A, T_A])) extends T_A
case class CC_B[C, D](a: (CC_A,CC_A), b: ((CC_A,T_A),CC_A)) extends T_B[C, (Char,Char)]
case class CC_C[E](a: T_B[E, (Char,Char)], b: T_B[E, (Char,Char)]) extends T_B[E, (Char,Char)]
case class CC_D[F](a: (T_A,CC_A)) extends T_B[F, (Char,Char)]

val v_a: T_B[T_A, (Char,Char)] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_, _, _),CC_A(_, _, _)), _) => 0 
  case CC_C(_, CC_B((_,_), _)) => 1 
  case CC_C(_, CC_C(_, CC_B(_, _))) => 2 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 3 
  case CC_C(_, CC_C(_, CC_D(_))) => 4 
  case CC_C(_, CC_D(_)) => 5 
  case CC_D((CC_A(_, _, _),CC_A(_, _, _))) => 6 
}
}