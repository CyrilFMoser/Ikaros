package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[T_B],T_A[T_B]), b: T_A[T_B], c: T_A[T_A[(Int,Char)]]) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: T_B) extends T_A[T_B]
case class CC_C() extends T_B
case class CC_D(a: T_A[T_B], b: CC_C) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_A((_,_), CC_A(_, _, _), _), _) => 0 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_A((_,_), CC_B(_, _), _), _) => 1 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_A(_, _, _), CC_C()), _) => 2 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_B(_, _), CC_C()), _) => 3 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_A(_, _, _), CC_D(_, _)), _) => 4 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_B(CC_B(_, _), CC_D(_, _)), _) => 5 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), CC_A((_,_), CC_A(_, _, _), _), _) => 6 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), CC_A((_,_), CC_B(_, _), _), _) => 7 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), CC_B(CC_A(_, _, _), CC_C()), _) => 8 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), CC_B(CC_B(_, _), CC_C()), _) => 9 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), CC_B(CC_A(_, _, _), CC_D(_, _)), _) => 10 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), CC_B(CC_B(_, _), CC_D(_, _)), _) => 11 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_A((_,_), CC_A(_, _, _), _), _) => 12 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_A((_,_), CC_B(_, _), _), _) => 13 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_B(CC_A(_, _, _), CC_C()), _) => 14 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_B(CC_B(_, _), CC_C()), _) => 15 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_B(CC_A(_, _, _), CC_D(_, _)), _) => 16 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_B(CC_B(_, _), CC_D(_, _)), _) => 17 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_A((_,_), CC_A(_, _, _), _), _) => 18 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_A((_,_), CC_B(_, _), _), _) => 19 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_B(CC_A(_, _, _), CC_C()), _) => 20 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_B(CC_B(_, _), CC_C()), _) => 21 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_B(CC_A(_, _, _), CC_D(_, _)), _) => 22 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_B(CC_B(_, _), CC_D(_, _)), _) => 23 
  case CC_B(_, _) => 24 
}
}