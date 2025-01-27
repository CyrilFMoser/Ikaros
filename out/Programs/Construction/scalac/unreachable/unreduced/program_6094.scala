package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_A), b: T_B[T_B[T_A]], c: T_A) extends T_A
case class CC_B(a: Boolean, b: T_B[T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D[B](a: T_B[Boolean]) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, CC_A(_, _, _)) => 0 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, CC_B(_, _)) => 1 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, CC_C()) => 2 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), _, CC_A(_, _, _)) => 3 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), _, CC_B(_, _)) => 4 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), _, CC_C()) => 5 
  case CC_A((CC_A(_, _, _),CC_C()), _, CC_A(_, _, _)) => 6 
  case CC_A((CC_A(_, _, _),CC_C()), _, CC_B(_, _)) => 7 
  case CC_A((CC_A(_, _, _),CC_C()), _, CC_C()) => 8 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), _, CC_A(_, _, _)) => 9 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), _, CC_B(_, _)) => 10 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), _, CC_C()) => 11 
  case CC_A((CC_B(_, _),CC_B(_, _)), _, CC_A(_, _, _)) => 12 
  case CC_A((CC_B(_, _),CC_B(_, _)), _, CC_B(_, _)) => 13 
  case CC_A((CC_B(_, _),CC_B(_, _)), _, CC_C()) => 14 
  case CC_A((CC_B(_, _),CC_C()), _, CC_A(_, _, _)) => 15 
  case CC_A((CC_B(_, _),CC_C()), _, CC_B(_, _)) => 16 
  case CC_A((CC_B(_, _),CC_C()), _, CC_C()) => 17 
  case CC_A((CC_C(),CC_A(_, _, _)), _, CC_A(_, _, _)) => 18 
  case CC_A((CC_C(),CC_A(_, _, _)), _, CC_B(_, _)) => 19 
  case CC_A((CC_C(),CC_A(_, _, _)), _, CC_C()) => 20 
  case CC_A((CC_C(),CC_B(_, _)), _, CC_A(_, _, _)) => 21 
  case CC_A((CC_C(),CC_B(_, _)), _, CC_B(_, _)) => 22 
  case CC_A((CC_C(),CC_B(_, _)), _, CC_C()) => 23 
  case CC_A((CC_C(),CC_C()), _, CC_A(_, _, _)) => 24 
  case CC_A((CC_C(),CC_C()), _, CC_B(_, _)) => 25 
  case CC_A((CC_C(),CC_C()), _, CC_C()) => 26 
  case CC_B(_, _) => 27 
  case CC_C() => 28 
}
}