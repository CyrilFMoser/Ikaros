package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[T_B],Boolean), b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[(Byte,Char)], b: T_A[T_B], c: Byte) extends T_A[T_B]
case class CC_C(a: CC_B) extends T_B
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),_), CC_A((_,_), CC_A(_, _))) => 0 
  case CC_A((CC_B(_, _, _),_), CC_A((_,_), CC_A(_, _))) => 1 
  case CC_A((CC_A(_, _),_), CC_A((_,_), CC_B(_, _, _))) => 2 
  case CC_A((CC_B(_, _, _),_), CC_A((_,_), CC_B(_, _, _))) => 3 
  case CC_A((CC_A(_, _),_), CC_B(_, _, _)) => 4 
  case CC_A((CC_B(_, _, _),_), CC_B(_, _, _)) => 5 
}
}