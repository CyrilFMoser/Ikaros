package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char, b: Boolean, c: T_B[D]) extends T_A[D, Int]
case class CC_B[E]() extends T_A[E, Int]
case class CC_C(a: Int) extends T_B[Char]
case class CC_D() extends T_B[Char]
case class CC_E(a: (T_A[Byte, Int],Char), b: T_B[Char]) extends T_B[Char]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E((CC_A(_, _, _),_), CC_C(_)) => 0 
  case CC_E((CC_A(_, _, _),_), CC_D()) => 1 
  case CC_E((CC_A(_, _, _),_), CC_E((_,_), CC_C(_))) => 2 
  case CC_E((CC_A(_, _, _),_), CC_E((_,_), CC_D())) => 3 
  case CC_E((CC_A(_, _, _),_), CC_E((_,_), CC_E(_, _))) => 4 
  case CC_E((CC_B(),_), CC_C(_)) => 5 
  case CC_E((CC_B(),_), CC_D()) => 6 
  case CC_E((CC_B(),_), CC_E((_,_), CC_C(_))) => 7 
  case CC_E((CC_B(),_), CC_E((_,_), CC_D())) => 8 
  case CC_E((CC_B(),_), CC_E((_,_), CC_E(_, _))) => 9 
}
}