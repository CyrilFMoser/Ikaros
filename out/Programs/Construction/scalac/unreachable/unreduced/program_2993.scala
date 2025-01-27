package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[Byte, Byte], Boolean], b: T_A) extends T_A
case class CC_B(a: (T_A,(T_A,Int)), b: CC_A, c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: C, b: T_A, c: T_B[C, C]) extends T_B[T_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_C())) => 2 
  case CC_A(_, CC_B((_,_), _, _)) => 3 
  case CC_A(_, CC_C()) => 4 
  case CC_B((CC_B(_, _, _),(_,_)), CC_A(_, _), CC_A(_, _)) => 5 
  case CC_B((CC_C(),(_,_)), CC_A(_, _), CC_A(_, _)) => 6 
  case CC_C() => 7 
}
}
// This is not matched: CC_B((CC_A(_, _),(_,_)), CC_A(_, _), CC_A(_, _))