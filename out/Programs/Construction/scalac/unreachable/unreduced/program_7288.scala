package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C], c: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D](a: T_B, b: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C[E](a: T_A[T_B, Char], b: CC_A[E]) extends T_A[T_B, E]
case class CC_D(a: Byte) extends T_B
case class CC_E(a: CC_C[CC_D], b: T_A[T_B, CC_B[T_B]], c: (Int,Int)) extends T_B
case class CC_F(a: CC_E) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
  case CC_D(_) => 1 
  case CC_E(CC_C(CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_D(_), _, _), (_,_)) => 2 
  case CC_E(CC_C(CC_B(_, _), CC_A(_, _, _)), CC_A(CC_D(_), _, _), (_,_)) => 3 
  case CC_E(CC_C(CC_C(_, _), CC_A(_, _, _)), CC_A(CC_D(_), _, _), (_,_)) => 4 
  case CC_E(CC_C(CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_E(_, _, _), _, _), (_,_)) => 5 
  case CC_E(CC_C(CC_B(_, _), CC_A(_, _, _)), CC_A(CC_E(_, _, _), _, _), (_,_)) => 6 
  case CC_E(CC_C(CC_C(_, _), CC_A(_, _, _)), CC_A(CC_E(_, _, _), _, _), (_,_)) => 7 
  case CC_E(CC_C(CC_A(_, _, _), CC_A(_, _, _)), CC_A(CC_F(_), _, _), (_,_)) => 8 
  case CC_E(CC_C(CC_B(_, _), CC_A(_, _, _)), CC_A(CC_F(_), _, _), (_,_)) => 9 
  case CC_E(CC_C(CC_C(_, _), CC_A(_, _, _)), CC_A(CC_F(_), _, _), (_,_)) => 10 
  case CC_E(CC_C(CC_A(_, _, _), CC_A(_, _, _)), CC_B(_, _), (_,_)) => 11 
  case CC_E(CC_C(CC_B(_, _), CC_A(_, _, _)), CC_B(_, _), (_,_)) => 12 
  case CC_E(CC_C(CC_C(_, _), CC_A(_, _, _)), CC_B(_, _), (_,_)) => 13 
  case CC_E(CC_C(CC_A(_, _, _), CC_A(_, _, _)), CC_C(CC_A(_, _, _), CC_A(_, _, _)), (_,_)) => 14 
  case CC_E(CC_C(CC_B(_, _), CC_A(_, _, _)), CC_C(CC_A(_, _, _), CC_A(_, _, _)), (_,_)) => 15 
  case CC_E(CC_C(CC_C(_, _), CC_A(_, _, _)), CC_C(CC_A(_, _, _), CC_A(_, _, _)), (_,_)) => 16 
  case CC_E(CC_C(CC_A(_, _, _), CC_A(_, _, _)), CC_C(CC_B(_, _), CC_A(_, _, _)), (_,_)) => 17 
  case CC_E(CC_C(CC_B(_, _), CC_A(_, _, _)), CC_C(CC_B(_, _), CC_A(_, _, _)), (_,_)) => 18 
  case CC_E(CC_C(CC_C(_, _), CC_A(_, _, _)), CC_C(CC_B(_, _), CC_A(_, _, _)), (_,_)) => 19 
  case CC_E(CC_C(CC_A(_, _, _), CC_A(_, _, _)), CC_C(CC_C(_, _), CC_A(_, _, _)), (_,_)) => 20 
  case CC_E(CC_C(CC_B(_, _), CC_A(_, _, _)), CC_C(CC_C(_, _), CC_A(_, _, _)), (_,_)) => 21 
  case CC_E(CC_C(CC_C(_, _), CC_A(_, _, _)), CC_C(CC_C(_, _), CC_A(_, _, _)), (_,_)) => 22 
  case CC_F(_) => 23 
}
}