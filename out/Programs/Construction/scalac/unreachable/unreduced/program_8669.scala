package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: (Int,T_A), b: T_A, c: T_A) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C](a: CC_B, b: CC_A, c: T_B[C, C]) extends T_B[C, CC_C]
case class CC_E[D](a: CC_B, b: Byte) extends T_B[D, CC_C]
case class CC_F[E]() extends T_B[CC_E[E], E]

val v_a: T_B[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_B((_,_), CC_A(), CC_A()), CC_A(), _) => 0 
  case CC_D(CC_B((_,_), CC_B(_, _, _), CC_A()), CC_A(), _) => 1 
  case CC_D(CC_B((_,_), CC_C(_), CC_A()), CC_A(), _) => 2 
  case CC_D(CC_B((_,_), CC_A(), CC_B(_, _, _)), CC_A(), _) => 3 
  case CC_D(CC_B((_,_), CC_B(_, _, _), CC_B(_, _, _)), CC_A(), _) => 4 
  case CC_D(CC_B((_,_), CC_C(_), CC_B(_, _, _)), CC_A(), _) => 5 
  case CC_D(CC_B((_,_), CC_A(), CC_C(_)), CC_A(), _) => 6 
  case CC_D(CC_B((_,_), CC_B(_, _, _), CC_C(_)), CC_A(), _) => 7 
  case CC_D(CC_B((_,_), CC_C(_), CC_C(_)), CC_A(), _) => 8 
  case CC_E(_, _) => 9 
}
}