package Program_15 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,Int), b: T_B[T_A], c: T_A) extends T_A
case class CC_B[B]() extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: Char, b: T_A) extends T_B[C]
case class CC_E[D](a: CC_A, b: CC_D[CC_A]) extends T_B[D]
case class CC_F[E](a: Char, b: CC_A) extends T_B[E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_A((CC_B(),_), _, CC_C()) => 2 
  case CC_A((CC_C(),_), CC_E(_, _), CC_B()) => 3 
  case CC_A((CC_B(),_), _, CC_B()) => 4 
  case CC_A((CC_B(),12), CC_E(_, _), _) => 5 
  case CC_A((CC_C(),_), CC_F(_, _), CC_B()) => 6 
  case CC_A((CC_B(),12), _, CC_C()) => 7 
  case CC_A((CC_A(_, _, _),_), CC_F(_, _), CC_B()) => 8 
  case CC_A((CC_B(),_), CC_D(_, _), _) => 9 
  case CC_A((CC_B(),_), CC_F(_, _), CC_A(_, _, _)) => 10 
  case CC_A((CC_A(_, _, _),_), CC_E(_, _), CC_B()) => 11 
  case CC_A(_, CC_F(_, _), CC_C()) => 12 
  case CC_A((CC_C(),12), _, _) => 13 
  case CC_A((CC_A(_, _, _),_), CC_E(_, _), _) => 14 
  case CC_A((CC_B(),_), CC_E(_, _), CC_B()) => 15 
  case CC_A((CC_C(),_), CC_F(_, _), CC_A(_, _, _)) => 16 
  case CC_A((CC_B(),_), CC_F(_, _), _) => 17 
  case CC_A((CC_C(),12), CC_D(_, _), _) => 18 
  case CC_A((CC_C(),_), CC_D(_, _), CC_B()) => 19 
  case CC_A((CC_B(),12), CC_F(_, _), CC_A(_, _, _)) => 20 
  case CC_A((CC_B(),_), CC_E(_, _), CC_C()) => 21 
  case CC_A(_, _, CC_B()) => 22 
  case CC_A((CC_C(),_), _, CC_B()) => 23 
  case CC_A((CC_B(),12), CC_D(_, _), CC_A(_, _, _)) => 24 
  case CC_A((CC_B(),_), CC_D(_, _), CC_B()) => 25 
  case CC_A((CC_A(_, _, _),12), CC_F(_, _), CC_A(_, _, _)) => 26 
  case CC_A((CC_C(),_), CC_E(_, _), CC_C()) => 27 
  case CC_A((CC_B(),_), CC_E(_, _), CC_A(_, _, _)) => 28 
  case CC_A(_, _, _) => 29 
  case CC_A((CC_A(_, _, _),_), CC_F(_, _), _) => 30 
  case CC_A(_, CC_D(_, _), CC_C()) => 31 
  case CC_A((CC_B(),12), _, CC_B()) => 32 
  case CC_A((CC_A(_, _, _),12), _, CC_A(_, _, _)) => 33 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_B T_A T_A)