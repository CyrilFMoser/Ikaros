package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: F, b: (Byte,T_B[Byte, Char])) extends T_A[F, E]
case class CC_B[G, H]() extends T_A[H, G]
case class CC_C(a: T_A[T_A[Int, Byte], T_B[Char, Byte]], b: T_A[CC_B[Char, Int], T_A[Boolean, Boolean]]) extends T_A[T_A[T_A[Byte, Int], (Byte,Char)], T_A[Boolean, CC_B[Boolean, Char]]]
case class CC_D[I](a: I, b: T_B[T_A[I, I], I]) extends T_B[T_A[I, I], I]
case class CC_E(a: T_A[CC_A[Int, Byte], CC_A[CC_C, Int]], b: T_B[T_A[CC_C, CC_C], CC_A[CC_C, CC_C]], c: T_A[Byte, CC_C]) extends T_B[T_A[(T_B[Int, CC_C],T_A[Boolean, CC_C]), (T_B[Int, CC_C],T_A[Boolean, CC_C])], (T_B[Int, CC_C],T_A[Boolean, CC_C])]
case class CC_F(a: T_A[CC_B[CC_E, Int], CC_B[CC_E, (Int,Int)]]) extends T_B[T_A[(T_B[Int, CC_C],T_A[Boolean, CC_C]), (T_B[Int, CC_C],T_A[Boolean, CC_C])], (T_B[Int, CC_C],T_A[Boolean, CC_C])]

val v_a: T_B[T_A[(T_B[Int, CC_C],T_A[Boolean, CC_C]), (T_B[Int, CC_C],T_A[Boolean, CC_C])], (T_B[Int, CC_C],T_A[Boolean, CC_C])] = null
val v_b: Int = v_a match{
  case CC_D((_,CC_A(_, _)), CC_D((_,_), CC_D(_, _))) => 0 
  case CC_D((_,CC_B()), CC_D((_,_), CC_D(_, _))) => 1 
  case CC_D((_,CC_A(_, _)), CC_D((_,_), CC_E(_, _, _))) => 2 
  case CC_D((_,CC_B()), CC_D((_,_), CC_E(_, _, _))) => 3 
  case CC_D((_,CC_A(_, _)), CC_D((_,_), CC_F(_))) => 4 
  case CC_D((_,CC_B()), CC_D((_,_), CC_F(_))) => 5 
  case CC_D((_,CC_A(_, _)), CC_E(_, _, _)) => 6 
  case CC_D((_,CC_B()), CC_E(_, _, _)) => 7 
  case CC_D((_,CC_A(_, _)), CC_F(CC_A(_, _))) => 8 
  case CC_D((_,CC_B()), CC_F(CC_A(_, _))) => 9 
  case CC_D((_,CC_A(_, _)), CC_F(CC_B())) => 10 
  case CC_D((_,CC_B()), CC_F(CC_B())) => 11 
  case CC_E(CC_A(_, _), _, CC_A(_, (_,_))) => 12 
  case CC_E(CC_A(_, _), _, CC_B()) => 13 
  case CC_E(CC_B(), _, CC_A(_, (_,_))) => 14 
  case CC_E(CC_B(), _, CC_B()) => 15 
  case CC_F(CC_A(CC_B(), (_,_))) => 16 
  case CC_F(CC_B()) => 17 
}
}