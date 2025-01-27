package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[T_A[D, D]], c: T_B[D]) extends T_A[T_A[(Byte,Char), T_B[Byte]], D]
case class CC_B(a: CC_A[CC_A[(Boolean,Boolean)]]) extends T_A[T_A[(Byte,Char), T_B[Byte]], T_A[T_A[Boolean, Byte], (Byte,Int)]]
case class CC_C[E]() extends T_A[T_A[(Byte,Char), T_B[Byte]], E]
case class CC_D() extends T_B[CC_B]
case class CC_E(a: CC_D, b: T_B[CC_B], c: T_A[CC_B, T_A[CC_B, (Byte,Byte)]]) extends T_B[CC_B]
case class CC_F(a: T_B[CC_B], b: T_B[CC_B]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_D(), CC_D(), _) => 1 
  case CC_E(CC_D(), CC_E(_, _, _), _) => 2 
  case CC_E(CC_D(), CC_F(CC_D(), CC_D()), _) => 3 
  case CC_E(CC_D(), CC_F(CC_E(_, _, _), CC_D()), _) => 4 
  case CC_E(CC_D(), CC_F(CC_F(_, _), CC_D()), _) => 5 
  case CC_E(CC_D(), CC_F(CC_D(), CC_E(_, _, _)), _) => 6 
  case CC_E(CC_D(), CC_F(CC_E(_, _, _), CC_E(_, _, _)), _) => 7 
  case CC_E(CC_D(), CC_F(CC_F(_, _), CC_E(_, _, _)), _) => 8 
  case CC_E(CC_D(), CC_F(CC_D(), CC_F(_, _)), _) => 9 
  case CC_E(CC_D(), CC_F(CC_E(_, _, _), CC_F(_, _)), _) => 10 
  case CC_E(CC_D(), CC_F(CC_F(_, _), CC_F(_, _)), _) => 11 
  case CC_F(CC_D(), CC_D()) => 12 
  case CC_F(CC_D(), CC_E(_, _, _)) => 13 
  case CC_F(CC_D(), CC_F(_, _)) => 14 
  case CC_F(CC_E(_, _, _), CC_D()) => 15 
  case CC_F(CC_E(_, _, _), CC_E(_, _, _)) => 16 
  case CC_F(CC_E(_, _, _), CC_F(_, _)) => 17 
  case CC_F(CC_F(CC_D(), CC_D()), CC_D()) => 18 
  case CC_F(CC_F(CC_D(), CC_D()), CC_E(_, _, _)) => 19 
  case CC_F(CC_F(CC_D(), CC_D()), CC_F(_, _)) => 20 
  case CC_F(CC_F(CC_E(_, _, _), CC_D()), CC_D()) => 21 
  case CC_F(CC_F(CC_E(_, _, _), CC_D()), CC_E(_, _, _)) => 22 
  case CC_F(CC_F(CC_E(_, _, _), CC_D()), CC_F(_, _)) => 23 
  case CC_F(CC_F(CC_F(_, _), CC_D()), CC_D()) => 24 
  case CC_F(CC_F(CC_F(_, _), CC_D()), CC_E(_, _, _)) => 25 
  case CC_F(CC_F(CC_F(_, _), CC_D()), CC_F(_, _)) => 26 
  case CC_F(CC_F(CC_D(), CC_E(_, _, _)), CC_D()) => 27 
  case CC_F(CC_F(CC_D(), CC_E(_, _, _)), CC_E(_, _, _)) => 28 
  case CC_F(CC_F(CC_D(), CC_E(_, _, _)), CC_F(_, _)) => 29 
  case CC_F(CC_F(CC_E(_, _, _), CC_E(_, _, _)), CC_D()) => 30 
  case CC_F(CC_F(CC_E(_, _, _), CC_E(_, _, _)), CC_E(_, _, _)) => 31 
  case CC_F(CC_F(CC_E(_, _, _), CC_E(_, _, _)), CC_F(_, _)) => 32 
  case CC_F(CC_F(CC_F(_, _), CC_E(_, _, _)), CC_D()) => 33 
  case CC_F(CC_F(CC_F(_, _), CC_E(_, _, _)), CC_E(_, _, _)) => 34 
  case CC_F(CC_F(CC_F(_, _), CC_E(_, _, _)), CC_F(_, _)) => 35 
  case CC_F(CC_F(CC_D(), CC_F(_, _)), CC_D()) => 36 
  case CC_F(CC_F(CC_D(), CC_F(_, _)), CC_E(_, _, _)) => 37 
  case CC_F(CC_F(CC_D(), CC_F(_, _)), CC_F(_, _)) => 38 
  case CC_F(CC_F(CC_E(_, _, _), CC_F(_, _)), CC_D()) => 39 
  case CC_F(CC_F(CC_E(_, _, _), CC_F(_, _)), CC_E(_, _, _)) => 40 
  case CC_F(CC_F(CC_E(_, _, _), CC_F(_, _)), CC_F(_, _)) => 41 
  case CC_F(CC_F(CC_F(_, _), CC_F(_, _)), CC_D()) => 42 
  case CC_F(CC_F(CC_F(_, _), CC_F(_, _)), CC_E(_, _, _)) => 43 
  case CC_F(CC_F(CC_F(_, _), CC_F(_, _)), CC_F(_, _)) => 44 
}
}