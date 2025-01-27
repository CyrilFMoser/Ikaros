package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E, F](a: (T_A[Boolean],(Byte,Boolean)), b: Byte, c: T_A[F]) extends T_A[E]
case class CC_C[G](a: T_A[G], b: T_B[G, T_A[G]], c: T_A[G]) extends T_A[G]
case class CC_D[H](a: H, b: Int) extends T_B[H, (T_A[Int],(Int,Byte))]
case class CC_E(a: T_A[CC_B[Byte, (Byte,Boolean)]], b: CC_A[T_B[Int, Boolean]]) extends T_B[Char, (T_A[Int],(Int,Byte))]
case class CC_F[I](a: T_A[I], b: CC_C[CC_B[I, CC_E]]) extends T_B[I, (T_A[Int],(Int,Byte))]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(), _, CC_A()) => 2 
  case CC_C(CC_A(), _, CC_B(_, _, _)) => 3 
  case CC_C(CC_A(), _, CC_C(CC_A(), _, _)) => 4 
  case CC_C(CC_A(), _, CC_C(CC_B(_, _, _), _, _)) => 5 
  case CC_C(CC_A(), _, CC_C(CC_C(_, _, _), _, _)) => 6 
  case CC_C(CC_B((_,_), _, _), _, CC_A()) => 7 
  case CC_C(CC_B((_,_), _, _), _, CC_B(_, _, _)) => 8 
  case CC_C(CC_B((_,_), _, _), _, CC_C(CC_A(), _, _)) => 9 
  case CC_C(CC_B((_,_), _, _), _, CC_C(CC_B(_, _, _), _, _)) => 10 
  case CC_C(CC_B((_,_), _, _), _, CC_C(CC_C(_, _, _), _, _)) => 11 
  case CC_C(CC_C(CC_A(), _, _), _, CC_A()) => 12 
  case CC_C(CC_C(CC_A(), _, _), _, CC_B(_, _, _)) => 13 
  case CC_C(CC_C(CC_A(), _, _), _, CC_C(CC_A(), _, _)) => 14 
  case CC_C(CC_C(CC_A(), _, _), _, CC_C(CC_B(_, _, _), _, _)) => 15 
  case CC_C(CC_C(CC_A(), _, _), _, CC_C(CC_C(_, _, _), _, _)) => 16 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, CC_A()) => 17 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, CC_B(_, _, _)) => 18 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, CC_C(CC_A(), _, _)) => 19 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, CC_C(CC_B(_, _, _), _, _)) => 20 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, CC_C(CC_C(_, _, _), _, _)) => 21 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, CC_A()) => 22 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, CC_B(_, _, _)) => 23 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, CC_C(CC_A(), _, _)) => 24 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, CC_C(CC_B(_, _, _), _, _)) => 25 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, CC_C(CC_C(_, _, _), _, _)) => 26 
}
}