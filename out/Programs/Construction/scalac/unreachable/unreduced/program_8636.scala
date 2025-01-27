package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: (T_B[T_A],((Boolean,Boolean),T_A)), c: (T_A,T_A)) extends T_A
case class CC_B(a: T_B[Boolean], b: T_B[T_B[(Char,Byte)]]) extends T_A
case class CC_C(a: Char, b: T_A) extends T_A
case class CC_D(a: (T_B[CC_B],CC_C), b: Int) extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]
case class CC_F(a: CC_E, b: CC_A, c: (((Byte,Int),CC_D),T_A)) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D((_,CC_C(_, _)), _) => 0 
  case CC_E() => 1 
  case CC_F(_, _, ((_,_),CC_A(_, _, _))) => 2 
  case CC_F(_, _, ((_,_),CC_B(_, _))) => 3 
  case CC_F(_, _, ((_,_),CC_C(_, _))) => 4 
}
}