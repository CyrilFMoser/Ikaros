package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Char, b: T_A[Int], c: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B[E, D]() extends T_B[D, E]
case class CC_C[G, F](a: (CC_A,(CC_A,CC_A)), b: T_B[F, F], c: T_B[G, G]) extends T_B[G, F]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((CC_A(_, _, _),(_,_)), CC_C((_,_), CC_B(), CC_B()), CC_B()) => 1 
  case CC_C((CC_A(_, _, _),(_,_)), CC_C((_,_), CC_B(), CC_C(_, _, _)), CC_B()) => 2 
  case CC_C((CC_A(_, _, _),(_,_)), CC_C((_,_), CC_C(_, _, _), CC_B()), CC_B()) => 3 
  case CC_C((CC_A(_, _, _),(_,_)), CC_C((_,_), CC_C(_, _, _), CC_C(_, _, _)), CC_B()) => 4 
  case CC_C((CC_A(_, _, _),(_,_)), CC_B(), CC_C((_,_), _, _)) => 5 
  case CC_C((CC_A(_, _, _),(_,_)), CC_C((_,_), CC_B(), CC_B()), CC_C((_,_), _, _)) => 6 
  case CC_C((CC_A(_, _, _),(_,_)), CC_C((_,_), CC_B(), CC_C(_, _, _)), CC_C((_,_), _, _)) => 7 
  case CC_C((CC_A(_, _, _),(_,_)), CC_C((_,_), CC_C(_, _, _), CC_B()), CC_C((_,_), _, _)) => 8 
  case CC_C((CC_A(_, _, _),(_,_)), CC_C((_,_), CC_C(_, _, _), CC_C(_, _, _)), CC_C((_,_), _, _)) => 9 
}
}
// This is not matched: CC_C((CC_A(_, _, _),(_,_)), CC_B(), CC_B())