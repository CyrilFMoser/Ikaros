package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, T_A], b: T_A, c: T_B[T_B[T_A, T_A], T_B[Boolean, T_A]]) extends T_A
case class CC_B(a: T_B[T_B[Int, CC_A], T_A], b: T_A, c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: CC_A, b: CC_A, c: CC_B) extends T_B[C, CC_A]
case class CC_E[D]() extends T_B[D, CC_A]
case class CC_F[E](a: (CC_E[(Char,Char)],T_B[CC_B, (Byte,Boolean)]), b: T_A, c: (Byte,T_B[CC_C, CC_A])) extends T_B[E, CC_A]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_B(_, _, _)) => 0 
  case CC_E() => 1 
  case CC_F((_,_), CC_A(_, _, _), (_,_)) => 2 
  case CC_F((_,_), CC_B(_, _, _), (_,_)) => 3 
  case CC_F((_,_), CC_C(), (_,_)) => 4 
}
}