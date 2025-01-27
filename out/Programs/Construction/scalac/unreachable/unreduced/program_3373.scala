package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: (T_B[CC_A, CC_A],T_B[T_A, T_A]), c: Boolean) extends T_A
case class CC_D[C](a: C) extends T_B[CC_C, C]
case class CC_E[D](a: T_A, b: D) extends T_B[CC_C, D]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_B()) => 1 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), CC_C(CC_A(_, _, _), (_,_), _)) => 2 
  case CC_A(_, CC_A(_, CC_B(), CC_A(_, _, _)), CC_A(_, _, _)) => 3 
  case CC_A(_, CC_A(_, CC_B(), CC_A(_, _, _)), CC_B()) => 4 
  case CC_A(_, CC_A(_, CC_B(), CC_A(_, _, _)), CC_C(CC_A(_, _, _), (_,_), _)) => 5 
  case CC_A(_, CC_A(_, CC_C(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 6 
  case CC_A(_, CC_A(_, CC_C(_, _, _), CC_A(_, _, _)), CC_B()) => 7 
  case CC_A(_, CC_A(_, CC_C(_, _, _), CC_A(_, _, _)), CC_C(CC_A(_, _, _), (_,_), _)) => 8 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B()), CC_A(_, _, _)) => 9 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B()), CC_B()) => 10 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B()), CC_C(CC_A(_, _, _), (_,_), _)) => 11 
  case CC_A(_, CC_A(_, CC_B(), CC_B()), CC_A(_, _, _)) => 12 
  case CC_A(_, CC_A(_, CC_B(), CC_B()), CC_B()) => 13 
  case CC_A(_, CC_A(_, CC_B(), CC_B()), CC_C(CC_A(_, _, _), (_,_), _)) => 14 
  case CC_A(_, CC_A(_, CC_C(_, _, _), CC_B()), CC_A(_, _, _)) => 15 
  case CC_A(_, CC_A(_, CC_C(_, _, _), CC_B()), CC_B()) => 16 
  case CC_A(_, CC_A(_, CC_C(_, _, _), CC_B()), CC_C(CC_A(_, _, _), (_,_), _)) => 17 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C(_, _, _)), CC_A(_, _, _)) => 18 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C(_, _, _)), CC_B()) => 19 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C(_, _, _)), CC_C(CC_A(_, _, _), (_,_), _)) => 20 
  case CC_A(_, CC_A(_, CC_B(), CC_C(_, _, _)), CC_A(_, _, _)) => 21 
  case CC_A(_, CC_A(_, CC_B(), CC_C(_, _, _)), CC_B()) => 22 
  case CC_A(_, CC_A(_, CC_B(), CC_C(_, _, _)), CC_C(CC_A(_, _, _), (_,_), _)) => 23 
  case CC_A(_, CC_A(_, CC_C(_, _, _), CC_C(_, _, _)), CC_A(_, _, _)) => 24 
  case CC_A(_, CC_A(_, CC_C(_, _, _), CC_C(_, _, _)), CC_B()) => 25 
  case CC_A(_, CC_A(_, CC_C(_, _, _), CC_C(_, _, _)), CC_C(CC_A(_, _, _), (_,_), _)) => 26 
  case CC_A(_, CC_B(), CC_A(_, _, _)) => 27 
  case CC_A(_, CC_B(), CC_B()) => 28 
  case CC_A(_, CC_B(), CC_C(CC_A(_, _, _), (_,_), _)) => 29 
  case CC_A(_, CC_C(CC_A(_, _, _), _, _), CC_A(_, _, _)) => 30 
  case CC_A(_, CC_C(CC_A(_, _, _), _, _), CC_B()) => 31 
  case CC_A(_, CC_C(CC_A(_, _, _), _, _), CC_C(CC_A(_, _, _), (_,_), _)) => 32 
}
}