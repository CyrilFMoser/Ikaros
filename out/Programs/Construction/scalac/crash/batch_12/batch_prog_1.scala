package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[D, D], b: T_A[C, D], c: (T_A[Boolean, Char],T_A[Char, Byte])) extends T_A[C, D]
case class CC_B[E, F]() extends T_A[F, E]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), CC_A(_, CC_A(_, _, _), (_,_)), (CC_A(_, _, _),CC_A(_, _, _))) => 0 
  case CC_A(CC_A(CC_B(), _, (_,_)), CC_A(_, CC_A(_, _, _), (_,_)), (CC_A(_, _, _),CC_A(_, _, _))) => 1 
  case CC_A(CC_B(), CC_A(_, CC_A(_, _, _), (_,_)), (CC_A(_, _, _),CC_A(_, _, _))) => 2 
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), CC_A(_, CC_B(), (_,_)), (CC_A(_, _, _),CC_A(_, _, _))) => 3 
  case CC_A(CC_A(CC_B(), _, (_,_)), CC_A(_, CC_B(), (_,_)), (CC_A(_, _, _),CC_A(_, _, _))) => 4 
  case CC_A(CC_B(), CC_A(_, CC_B(), (_,_)), (CC_A(_, _, _),CC_A(_, _, _))) => 5 
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), CC_B(), (CC_A(_, _, _),CC_A(_, _, _))) => 6 
  case CC_A(CC_A(CC_B(), _, (_,_)), CC_B(), (CC_A(_, _, _),CC_A(_, _, _))) => 7 
  case CC_A(CC_B(), CC_B(), (CC_A(_, _, _),CC_A(_, _, _))) => 8 
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), CC_A(_, CC_A(_, _, _), (_,_)), (CC_A(_, _, _),CC_B())) => 9 
  case CC_A(CC_A(CC_B(), _, (_,_)), CC_A(_, CC_A(_, _, _), (_,_)), (CC_A(_, _, _),CC_B())) => 10 
  case CC_A(CC_B(), CC_A(_, CC_A(_, _, _), (_,_)), (CC_A(_, _, _),CC_B())) => 11 
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), CC_A(_, CC_B(), (_,_)), (CC_A(_, _, _),CC_B())) => 12 
  case CC_A(CC_A(CC_B(), _, (_,_)), CC_A(_, CC_B(), (_,_)), (CC_A(_, _, _),CC_B())) => 13 
  case CC_A(CC_B(), CC_A(_, CC_B(), (_,_)), (CC_A(_, _, _),CC_B())) => 14 
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), CC_B(), (CC_A(_, _, _),CC_B())) => 15 
  case CC_A(CC_A(CC_B(), _, (_,_)), CC_B(), (CC_A(_, _, _),CC_B())) => 16 
  case CC_A(CC_B(), CC_B(), (CC_A(_, _, _),CC_B())) => 17 
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), CC_A(_, CC_A(_, _, _), (_,_)), (CC_B(),CC_A(_, _, _))) => 18 
  case CC_A(CC_A(CC_B(), _, (_,_)), CC_A(_, CC_A(_, _, _), (_,_)), (CC_B(),CC_A(_, _, _))) => 19 
  case CC_A(CC_B(), CC_A(_, CC_A(_, _, _), (_,_)), (CC_B(),CC_A(_, _, _))) => 20 
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), CC_A(_, CC_B(), (_,_)), (CC_B(),CC_A(_, _, _))) => 21 
  case CC_A(CC_A(CC_B(), _, (_,_)), CC_A(_, CC_B(), (_,_)), (CC_B(),CC_A(_, _, _))) => 22 
  case CC_A(CC_B(), CC_A(_, CC_B(), (_,_)), (CC_B(),CC_A(_, _, _))) => 23 
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), CC_B(), (CC_B(),CC_A(_, _, _))) => 24 
  case CC_A(CC_A(CC_B(), _, (_,_)), CC_B(), (CC_B(),CC_A(_, _, _))) => 25 
  case CC_A(CC_B(), CC_B(), (CC_B(),CC_A(_, _, _))) => 26 
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), CC_A(_, CC_A(_, _, _), (_,_)), (CC_B(),CC_B())) => 27 
  case CC_A(CC_A(CC_B(), _, (_,_)), CC_A(_, CC_A(_, _, _), (_,_)), (CC_B(),CC_B())) => 28 
  case CC_A(CC_B(), CC_A(_, CC_A(_, _, _), (_,_)), (CC_B(),CC_B())) => 29 
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), CC_A(_, CC_B(), (_,_)), (CC_B(),CC_B())) => 30 
  case CC_A(CC_A(CC_B(), _, (_,_)), CC_A(_, CC_B(), (_,_)), (CC_B(),CC_B())) => 31 
  case CC_A(CC_B(), CC_A(_, CC_B(), (_,_)), (CC_B(),CC_B())) => 32 
  case CC_A(CC_A(CC_A(_, _, _), _, (_,_)), CC_B(), (CC_B(),CC_B())) => 33 
  case CC_A(CC_A(CC_B(), _, (_,_)), CC_B(), (CC_B(),CC_B())) => 34 
  case CC_A(CC_B(), CC_B(), (CC_B(),CC_B())) => 35 
  case CC_B() => 36 
}
}