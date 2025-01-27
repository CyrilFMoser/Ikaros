package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (Byte,T_A[(Char,Byte), T_B]), b: T_A[C, Int], c: C) extends T_A[C, Int]
case class CC_B[D]() extends T_A[D, Int]
case class CC_C(a: T_B, b: T_B, c: CC_B[T_A[T_B, Int]]) extends T_A[T_A[CC_A[T_B], Int], Int]
case class CC_D(a: Byte, b: (T_B,Int), c: Byte) extends T_B

val v_a: T_A[CC_D, Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_A(_, _, _), CC_D(_, (_,_), 0)) => 0 
  case CC_A((_,_), CC_B(), CC_D(_, (_,_), 0)) => 1 
  case CC_A((_,_), CC_A(_, _, _), CC_D(_, (_,_), _)) => 2 
  case CC_A((_,_), CC_B(), CC_D(_, (_,_), _)) => 3 
  case CC_B() => 4 
}
}