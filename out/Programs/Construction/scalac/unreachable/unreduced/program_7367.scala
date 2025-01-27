package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: E, b: (T_A[Byte],T_A[(Boolean,Int)]), c: T_A[T_B[E, E]]) extends T_A[E]
case class CC_C[F](a: T_A[T_A[F]], b: F) extends T_A[F]
case class CC_D[G]() extends T_B[G, T_A[CC_B[Char]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (CC_A(),CC_A()), CC_A()) => 1 
  case CC_B(_, (CC_A(),CC_B(_, _, _)), CC_A()) => 2 
  case CC_B(_, (CC_A(),CC_C(_, _)), CC_A()) => 3 
  case CC_B(_, (CC_B(_, _, _),CC_A()), CC_A()) => 4 
  case CC_B(_, (CC_B(_, _, _),CC_B(_, _, _)), CC_A()) => 5 
  case CC_B(_, (CC_B(_, _, _),CC_C(_, _)), CC_A()) => 6 
  case CC_B(_, (CC_C(_, _),CC_A()), CC_A()) => 7 
  case CC_B(_, (CC_C(_, _),CC_B(_, _, _)), CC_A()) => 8 
  case CC_B(_, (CC_C(_, _),CC_C(_, _)), CC_A()) => 9 
  case CC_B(_, (CC_A(),CC_A()), CC_B(_, (_,_), CC_A())) => 10 
  case CC_B(_, (CC_A(),CC_B(_, _, _)), CC_B(_, (_,_), CC_A())) => 11 
  case CC_B(_, (CC_A(),CC_C(_, _)), CC_B(_, (_,_), CC_A())) => 12 
  case CC_B(_, (CC_B(_, _, _),CC_A()), CC_B(_, (_,_), CC_A())) => 13 
  case CC_B(_, (CC_B(_, _, _),CC_B(_, _, _)), CC_B(_, (_,_), CC_A())) => 14 
  case CC_B(_, (CC_B(_, _, _),CC_C(_, _)), CC_B(_, (_,_), CC_A())) => 15 
  case CC_B(_, (CC_C(_, _),CC_A()), CC_B(_, (_,_), CC_A())) => 16 
  case CC_B(_, (CC_C(_, _),CC_B(_, _, _)), CC_B(_, (_,_), CC_A())) => 17 
  case CC_B(_, (CC_C(_, _),CC_C(_, _)), CC_B(_, (_,_), CC_A())) => 18 
  case CC_B(_, (CC_A(),CC_A()), CC_B(_, (_,_), CC_B(_, _, _))) => 19 
  case CC_B(_, (CC_A(),CC_B(_, _, _)), CC_B(_, (_,_), CC_B(_, _, _))) => 20 
  case CC_B(_, (CC_A(),CC_C(_, _)), CC_B(_, (_,_), CC_B(_, _, _))) => 21 
  case CC_B(_, (CC_B(_, _, _),CC_A()), CC_B(_, (_,_), CC_B(_, _, _))) => 22 
  case CC_B(_, (CC_B(_, _, _),CC_B(_, _, _)), CC_B(_, (_,_), CC_B(_, _, _))) => 23 
  case CC_B(_, (CC_B(_, _, _),CC_C(_, _)), CC_B(_, (_,_), CC_B(_, _, _))) => 24 
  case CC_B(_, (CC_C(_, _),CC_A()), CC_B(_, (_,_), CC_B(_, _, _))) => 25 
  case CC_B(_, (CC_C(_, _),CC_B(_, _, _)), CC_B(_, (_,_), CC_B(_, _, _))) => 26 
  case CC_B(_, (CC_C(_, _),CC_C(_, _)), CC_B(_, (_,_), CC_B(_, _, _))) => 27 
  case CC_B(_, (CC_A(),CC_A()), CC_B(_, (_,_), CC_C(_, _))) => 28 
  case CC_B(_, (CC_A(),CC_B(_, _, _)), CC_B(_, (_,_), CC_C(_, _))) => 29 
  case CC_B(_, (CC_A(),CC_C(_, _)), CC_B(_, (_,_), CC_C(_, _))) => 30 
  case CC_B(_, (CC_B(_, _, _),CC_A()), CC_B(_, (_,_), CC_C(_, _))) => 31 
  case CC_B(_, (CC_B(_, _, _),CC_B(_, _, _)), CC_B(_, (_,_), CC_C(_, _))) => 32 
  case CC_B(_, (CC_B(_, _, _),CC_C(_, _)), CC_B(_, (_,_), CC_C(_, _))) => 33 
  case CC_B(_, (CC_C(_, _),CC_A()), CC_B(_, (_,_), CC_C(_, _))) => 34 
  case CC_B(_, (CC_C(_, _),CC_B(_, _, _)), CC_B(_, (_,_), CC_C(_, _))) => 35 
  case CC_B(_, (CC_C(_, _),CC_C(_, _)), CC_B(_, (_,_), CC_C(_, _))) => 36 
  case CC_B(_, (CC_A(),CC_A()), CC_C(_, _)) => 37 
  case CC_B(_, (CC_A(),CC_B(_, _, _)), CC_C(_, _)) => 38 
  case CC_B(_, (CC_A(),CC_C(_, _)), CC_C(_, _)) => 39 
  case CC_B(_, (CC_B(_, _, _),CC_A()), CC_C(_, _)) => 40 
  case CC_B(_, (CC_B(_, _, _),CC_B(_, _, _)), CC_C(_, _)) => 41 
  case CC_B(_, (CC_B(_, _, _),CC_C(_, _)), CC_C(_, _)) => 42 
  case CC_B(_, (CC_C(_, _),CC_A()), CC_C(_, _)) => 43 
  case CC_B(_, (CC_C(_, _),CC_B(_, _, _)), CC_C(_, _)) => 44 
  case CC_B(_, (CC_C(_, _),CC_C(_, _)), CC_C(_, _)) => 45 
  case CC_C(_, _) => 46 
}
}