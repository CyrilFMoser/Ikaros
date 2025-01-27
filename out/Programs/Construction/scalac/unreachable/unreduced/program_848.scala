package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: (T_A,T_B[CC_A]), b: T_B[Byte], c: CC_A) extends T_A
case class CC_C[B]() extends T_A
case class CC_D(a: T_B[Byte], b: Char, c: T_B[Boolean]) extends T_B[Byte]
case class CC_E[C](a: Byte) extends T_B[Byte]
case class CC_F(a: (T_A,CC_D), b: Boolean) extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,_), CC_D(_, _, _), CC_A(_, _)) => 1 
  case CC_B((_,_), CC_E(_), CC_A(_, _)) => 2 
  case CC_B((_,_), CC_F(_, _), CC_A(_, _)) => 3 
  case CC_C() => 4 
}
}