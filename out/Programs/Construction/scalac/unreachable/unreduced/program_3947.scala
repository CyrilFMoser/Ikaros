package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[((Char,Byte),(Char,Char)), Int], b: T_B[Char, T_B[Boolean, T_A]], c: (((Int,Int),T_A),T_A)) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: C, b: CC_B) extends T_B[T_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, ((_,_),CC_A(_, _, _))) => 0 
  case CC_A(_, _, ((_,_),CC_B())) => 1 
  case CC_A(_, _, ((_,_),CC_C())) => 2 
  case CC_B() => 3 
  case CC_C() => 4 
}
}