package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[T_A, T_A]], b: T_B[T_A, T_A]) extends T_A
case class CC_B(a: Boolean, b: T_A) extends T_A
case class CC_C(a: CC_A, b: ((CC_A,(Char,Char)),Byte), c: T_A) extends T_A
case class CC_D[C]() extends T_B[CC_B, C]
case class CC_E[D]() extends T_B[CC_B, D]
case class CC_F(a: Char, b: (Char,CC_B)) extends T_B[CC_B, T_B[Int, CC_C]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_, _), ((_,_),_), CC_A(_, _)) => 2 
  case CC_C(CC_A(_, _), ((_,_),_), CC_B(_, CC_A(_, _))) => 3 
  case CC_C(CC_A(_, _), ((_,_),_), CC_B(_, CC_B(_, _))) => 4 
  case CC_C(CC_A(_, _), ((_,_),_), CC_B(_, CC_C(_, _, _))) => 5 
  case CC_C(CC_A(_, _), ((_,_),_), CC_C(CC_A(_, _), _, _)) => 6 
}
}