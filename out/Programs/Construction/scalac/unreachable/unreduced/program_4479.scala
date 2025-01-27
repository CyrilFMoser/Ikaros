package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: Boolean, c: Boolean) extends T_A[T_B, C]
case class CC_B[D](a: T_A[Boolean, D], b: T_B, c: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C(a: T_A[T_B, T_A[T_B, T_B]]) extends T_B
case class CC_D(a: ((Byte,CC_C),(T_B,(Int,Char)))) extends T_B
case class CC_E(a: CC_A[(Byte,CC_C)], b: T_B, c: CC_B[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(((_,_),(_,_))) => 1 
  case CC_E(CC_A(CC_A(_, _, _), _, _), CC_C(CC_A(_, _, _)), CC_B(_, _, _)) => 2 
  case CC_E(CC_A(CC_B(_, _, _), _, _), CC_C(CC_A(_, _, _)), CC_B(_, _, _)) => 3 
  case CC_E(CC_A(CC_A(_, _, _), _, _), CC_C(CC_B(_, _, _)), CC_B(_, _, _)) => 4 
  case CC_E(CC_A(CC_A(_, _, _), _, _), CC_D((_,_)), CC_B(_, _, _)) => 5 
  case CC_E(CC_A(CC_B(_, _, _), _, _), CC_D((_,_)), CC_B(_, _, _)) => 6 
  case CC_E(CC_A(CC_A(_, _, _), _, _), CC_E(CC_A(_, _, _), CC_C(_), _), CC_B(_, _, _)) => 7 
  case CC_E(CC_A(CC_B(_, _, _), _, _), CC_E(CC_A(_, _, _), CC_C(_), _), CC_B(_, _, _)) => 8 
  case CC_E(CC_A(CC_A(_, _, _), _, _), CC_E(CC_A(_, _, _), CC_D(_), _), CC_B(_, _, _)) => 9 
  case CC_E(CC_A(CC_B(_, _, _), _, _), CC_E(CC_A(_, _, _), CC_D(_), _), CC_B(_, _, _)) => 10 
  case CC_E(CC_A(CC_A(_, _, _), _, _), CC_E(CC_A(_, _, _), CC_E(_, _, _), _), CC_B(_, _, _)) => 11 
  case CC_E(CC_A(CC_B(_, _, _), _, _), CC_E(CC_A(_, _, _), CC_E(_, _, _), _), CC_B(_, _, _)) => 12 
}
}
// This is not matched: CC_E(CC_A(CC_B(_, _, _), _, _), CC_C(CC_B(_, _, _)), CC_B(_, _, _))