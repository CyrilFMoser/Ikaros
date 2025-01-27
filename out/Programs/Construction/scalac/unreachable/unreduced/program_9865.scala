package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B() extends T_A[Boolean]
case class CC_C[D, E](a: T_A[D], b: T_A[E], c: E) extends T_A[D]
case class CC_D[F](a: T_A[Boolean]) extends T_B[((CC_B,CC_B),CC_A[CC_B])]
case class CC_E(a: ((CC_B,Int),T_B[Int]), b: T_A[T_A[(Char,Char)]], c: (T_A[Boolean],CC_A[CC_B])) extends T_B[((CC_B,CC_B),CC_A[CC_B])]
case class CC_F(a: Byte) extends T_B[((CC_B,CC_B),CC_A[CC_B])]

val v_a: T_B[((CC_B,CC_B),CC_A[CC_B])] = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
  case CC_D(CC_B()) => 1 
  case CC_D(CC_C(_, _, _)) => 2 
  case CC_E(((_,_),_), CC_A(), (CC_A(),CC_A())) => 3 
  case CC_E(((_,_),_), CC_C(CC_A(), _, _), (CC_A(),CC_A())) => 4 
  case CC_E(((_,_),_), CC_C(CC_C(_, _, _), _, _), (CC_A(),CC_A())) => 5 
  case CC_E(((_,_),_), CC_A(), (CC_B(),CC_A())) => 6 
  case CC_E(((_,_),_), CC_C(CC_A(), _, _), (CC_B(),CC_A())) => 7 
  case CC_E(((_,_),_), CC_C(CC_C(_, _, _), _, _), (CC_B(),CC_A())) => 8 
  case CC_E(((_,_),_), CC_A(), (CC_C(_, _, _),CC_A())) => 9 
  case CC_E(((_,_),_), CC_C(CC_A(), _, _), (CC_C(_, _, _),CC_A())) => 10 
  case CC_E(((_,_),_), CC_C(CC_C(_, _, _), _, _), (CC_C(_, _, _),CC_A())) => 11 
  case CC_F(_) => 12 
}
}