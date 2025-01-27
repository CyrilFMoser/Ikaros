package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, Int]
case class CC_B[D](a: T_B, b: (Byte,Boolean), c: D) extends T_A[D, Int]
case class CC_C[E](a: T_A[E, Int], b: Int, c: CC_B[CC_A[T_B]]) extends T_A[E, Int]
case class CC_D() extends T_B
case class CC_E(a: T_A[T_A[CC_D, T_B], Int]) extends T_B
case class CC_F(a: Byte) extends T_B

val v_a: T_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_D(), (_,_), CC_D()) => 1 
  case CC_B(CC_D(), (_,_), CC_E(CC_A())) => 2 
  case CC_B(CC_D(), (_,_), CC_E(CC_C(_, _, _))) => 3 
  case CC_B(CC_D(), (_,_), CC_F(0)) => 4 
  case CC_B(CC_D(), (_,_), CC_F(_)) => 5 
  case CC_B(CC_E(_), (_,_), CC_D()) => 6 
  case CC_B(CC_E(_), (_,_), CC_E(CC_A())) => 7 
  case CC_B(CC_E(_), (_,_), CC_E(CC_B(_, _, _))) => 8 
  case CC_B(CC_E(_), (_,_), CC_E(CC_C(_, _, _))) => 9 
  case CC_B(CC_E(_), (_,_), CC_F(0)) => 10 
  case CC_B(CC_E(_), (_,_), CC_F(_)) => 11 
  case CC_B(CC_F(_), (_,_), CC_D()) => 12 
  case CC_B(CC_F(_), (_,_), CC_E(CC_A())) => 13 
  case CC_B(CC_F(_), (_,_), CC_E(CC_B(_, _, _))) => 14 
  case CC_B(CC_F(_), (_,_), CC_E(CC_C(_, _, _))) => 15 
  case CC_B(CC_F(_), (_,_), CC_F(0)) => 16 
  case CC_B(CC_F(_), (_,_), CC_F(_)) => 17 
  case CC_C(CC_A(), _, CC_B(CC_D(), _, CC_A())) => 18 
  case CC_C(CC_B(_, (_,_), _), _, CC_B(CC_D(), _, CC_A())) => 19 
  case CC_C(CC_C(_, _, _), _, CC_B(CC_D(), _, CC_A())) => 20 
  case CC_C(CC_A(), _, CC_B(CC_E(_), _, CC_A())) => 21 
  case CC_C(CC_B(_, (_,_), _), _, CC_B(CC_E(_), _, CC_A())) => 22 
  case CC_C(CC_C(_, _, _), _, CC_B(CC_E(_), _, CC_A())) => 23 
  case CC_C(CC_A(), _, CC_B(CC_F(_), _, CC_A())) => 24 
  case CC_C(CC_B(_, (_,_), _), _, CC_B(CC_F(_), _, CC_A())) => 25 
  case CC_C(CC_C(_, _, _), _, CC_B(CC_F(_), _, CC_A())) => 26 
}
}
// This is not matched: CC_B(CC_D(), (_,_), CC_E(CC_B(_, _, _)))