package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D], b: T_A[D, D], c: (T_A[Char, Byte],Boolean)) extends T_A[C, D]
case class CC_B[F, E](a: CC_A[E, Boolean], b: T_A[F, E], c: T_A[E, E]) extends T_A[F, E]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), (_,_)), CC_A(CC_A(_, _, _), _, _), (CC_A(_, _, _),_)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), (_,_)), CC_A(CC_A(_, _, _), _, _), (CC_B(_, _, _),_)) => 1 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), (_,_)), CC_A(CC_A(_, _, _), _, _), (CC_A(_, _, _),_)) => 2 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), (_,_)), CC_A(CC_A(_, _, _), _, _), (CC_B(_, _, _),_)) => 3 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), (_,_)), CC_A(CC_A(_, _, _), _, _), (CC_A(_, _, _),_)) => 4 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), (_,_)), CC_A(CC_A(_, _, _), _, _), (CC_B(_, _, _),_)) => 5 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), (_,_)), CC_A(CC_A(_, _, _), _, _), (CC_A(_, _, _),_)) => 6 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), (_,_)), CC_A(CC_A(_, _, _), _, _), (CC_B(_, _, _),_)) => 7 
  case CC_A(CC_B(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), _, _), (CC_A(_, _, _),_)) => 8 
  case CC_A(CC_B(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), _, _), (CC_B(_, _, _),_)) => 9 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), _, _), (CC_A(_, _, _),_)) => 10 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_A(_, _, _)), CC_A(CC_A(_, _, _), _, _), (CC_B(_, _, _),_)) => 11 
  case CC_A(CC_B(_, CC_A(_, _, _), CC_B(_, _, _)), CC_A(CC_A(_, _, _), _, _), (CC_A(_, _, _),_)) => 12 
  case CC_A(CC_B(_, CC_A(_, _, _), CC_B(_, _, _)), CC_A(CC_A(_, _, _), _, _), (CC_B(_, _, _),_)) => 13 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A(CC_A(_, _, _), _, _), (CC_A(_, _, _),_)) => 14 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A(CC_A(_, _, _), _, _), (CC_B(_, _, _),_)) => 15 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), (_,_)), CC_A(CC_B(_, _, _), _, _), (CC_A(_, _, _),_)) => 16 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), (_,_)), CC_A(CC_B(_, _, _), _, _), (CC_B(_, _, _),_)) => 17 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), (_,_)), CC_A(CC_B(_, _, _), _, _), (CC_A(_, _, _),_)) => 18 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), (_,_)), CC_A(CC_B(_, _, _), _, _), (CC_B(_, _, _),_)) => 19 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), (_,_)), CC_A(CC_B(_, _, _), _, _), (CC_A(_, _, _),_)) => 20 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), (_,_)), CC_A(CC_B(_, _, _), _, _), (CC_B(_, _, _),_)) => 21 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), (_,_)), CC_A(CC_B(_, _, _), _, _), (CC_A(_, _, _),_)) => 22 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), (_,_)), CC_A(CC_B(_, _, _), _, _), (CC_B(_, _, _),_)) => 23 
  case CC_A(CC_B(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_B(_, _, _), _, _), (CC_A(_, _, _),_)) => 24 
  case CC_A(CC_B(_, CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_B(_, _, _), _, _), (CC_B(_, _, _),_)) => 25 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_A(_, _, _)), CC_A(CC_B(_, _, _), _, _), (CC_A(_, _, _),_)) => 26 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_A(_, _, _)), CC_A(CC_B(_, _, _), _, _), (CC_B(_, _, _),_)) => 27 
  case CC_A(CC_B(_, CC_A(_, _, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), _, _), (CC_A(_, _, _),_)) => 28 
  case CC_A(CC_B(_, CC_A(_, _, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), _, _), (CC_B(_, _, _),_)) => 29 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), _, _), (CC_A(_, _, _),_)) => 30 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), _, _), (CC_B(_, _, _),_)) => 31 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), (_,_)), CC_B(_, _, _), (CC_A(_, _, _),_)) => 32 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), (_,_)), CC_B(_, _, _), (CC_B(_, _, _),_)) => 33 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), (_,_)), CC_B(_, _, _), (CC_A(_, _, _),_)) => 34 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), (_,_)), CC_B(_, _, _), (CC_B(_, _, _),_)) => 35 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), (_,_)), CC_B(_, _, _), (CC_A(_, _, _),_)) => 36 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), (_,_)), CC_B(_, _, _), (CC_B(_, _, _),_)) => 37 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), (_,_)), CC_B(_, _, _), (CC_A(_, _, _),_)) => 38 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), (_,_)), CC_B(_, _, _), (CC_B(_, _, _),_)) => 39 
  case CC_A(CC_B(_, CC_A(_, _, _), CC_A(_, _, _)), CC_B(_, _, _), (CC_A(_, _, _),_)) => 40 
  case CC_A(CC_B(_, CC_A(_, _, _), CC_A(_, _, _)), CC_B(_, _, _), (CC_B(_, _, _),_)) => 41 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_A(_, _, _)), CC_B(_, _, _), (CC_A(_, _, _),_)) => 42 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_A(_, _, _)), CC_B(_, _, _), (CC_B(_, _, _),_)) => 43 
  case CC_A(CC_B(_, CC_A(_, _, _), CC_B(_, _, _)), CC_B(_, _, _), (CC_A(_, _, _),_)) => 44 
  case CC_A(CC_B(_, CC_A(_, _, _), CC_B(_, _, _)), CC_B(_, _, _), (CC_B(_, _, _),_)) => 45 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, _), (CC_A(_, _, _),_)) => 46 
  case CC_A(CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, _), (CC_B(_, _, _),_)) => 47 
  case CC_B(_, _, _) => 48 
}
}