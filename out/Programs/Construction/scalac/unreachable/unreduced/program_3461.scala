package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, (Char,Char)], T_A], c: T_B[T_A, (Char,T_A)]) extends T_A
case class CC_B(a: (T_B[T_A, (Byte,Boolean)],CC_A), b: Boolean, c: Boolean) extends T_A
case class CC_C(a: CC_B, b: T_A, c: T_B[CC_B, T_A]) extends T_A
case class CC_D[C](a: CC_A, b: CC_B, c: T_B[Boolean, T_A]) extends T_B[Boolean, T_A]
case class CC_E(a: T_B[Byte, CC_A]) extends T_B[Boolean, T_A]
case class CC_F() extends T_B[Boolean, T_A]

val v_a: T_B[Boolean, T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _), CC_B((_,_), _, _), CC_E(_)) => 0 
  case CC_D(CC_A(_, _, _), CC_B((_,_), _, _), CC_F()) => 1 
  case CC_E(_) => 2 
  case CC_F() => 3 
}
}
// This is not matched: CC_D(CC_A(_, _, _), CC_B((_,_), _, _), CC_D(CC_A(_, _, _), CC_B(_, _, _), _))