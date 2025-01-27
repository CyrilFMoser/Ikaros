package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: (T_B[Int],T_A[Int, Byte])) extends T_A[T_A[T_B[Char], T_B[Byte]], T_A[(Char,Int), T_A[(Byte,Char), Byte]]]
case class CC_B() extends T_A[T_A[T_B[Char], T_B[Byte]], T_A[(Char,Int), T_A[(Byte,Char), Byte]]]
case class CC_C(a: CC_A) extends T_A[T_A[T_B[Char], T_B[Byte]], T_A[(Char,Int), T_A[(Byte,Char), Byte]]]
case class CC_D[D](a: D) extends T_B[D]
case class CC_E[E](a: E, b: E, c: E) extends T_B[E]
case class CC_F[F]() extends T_B[F]

val v_a: T_B[T_A[T_A[T_B[Char], T_B[Byte]], T_A[(Char,Int), T_A[(Byte,Char), Byte]]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A((_,_))) => 0 
  case CC_D(CC_B()) => 1 
  case CC_D(CC_C(CC_A(_))) => 2 
  case CC_E(CC_A((_,_)), CC_A(_), CC_A((_,_))) => 3 
  case CC_E(CC_B(), CC_A(_), CC_A((_,_))) => 4 
  case CC_E(CC_C(CC_A(_)), CC_A(_), CC_A((_,_))) => 5 
  case CC_E(CC_A((_,_)), CC_A(_), CC_B()) => 6 
  case CC_E(CC_B(), CC_A(_), CC_B()) => 7 
  case CC_E(CC_C(CC_A(_)), CC_A(_), CC_B()) => 8 
  case CC_E(CC_A((_,_)), CC_A(_), CC_C(_)) => 9 
  case CC_E(CC_B(), CC_A(_), CC_C(_)) => 10 
  case CC_E(CC_C(CC_A(_)), CC_A(_), CC_C(_)) => 11 
  case CC_E(CC_A((_,_)), CC_B(), CC_A((_,_))) => 12 
  case CC_E(CC_B(), CC_B(), CC_A((_,_))) => 13 
  case CC_E(CC_C(CC_A(_)), CC_B(), CC_A((_,_))) => 14 
  case CC_E(CC_A((_,_)), CC_B(), CC_B()) => 15 
  case CC_E(CC_B(), CC_B(), CC_B()) => 16 
  case CC_E(CC_C(CC_A(_)), CC_B(), CC_B()) => 17 
  case CC_E(CC_A((_,_)), CC_B(), CC_C(_)) => 18 
  case CC_E(CC_B(), CC_B(), CC_C(_)) => 19 
  case CC_E(CC_C(CC_A(_)), CC_B(), CC_C(_)) => 20 
  case CC_E(CC_A((_,_)), CC_C(_), CC_A((_,_))) => 21 
  case CC_E(CC_C(CC_A(_)), CC_C(_), CC_A((_,_))) => 22 
  case CC_E(CC_A((_,_)), CC_C(_), CC_B()) => 23 
  case CC_E(CC_B(), CC_C(_), CC_B()) => 24 
  case CC_E(CC_C(CC_A(_)), CC_C(_), CC_B()) => 25 
  case CC_E(CC_A((_,_)), CC_C(_), CC_C(_)) => 26 
  case CC_E(CC_B(), CC_C(_), CC_C(_)) => 27 
  case CC_E(CC_C(CC_A(_)), CC_C(_), CC_C(_)) => 28 
  case CC_F() => 29 
}
}
// This is not matched: CC_E(CC_B(), CC_C(_), CC_A((_,_)))