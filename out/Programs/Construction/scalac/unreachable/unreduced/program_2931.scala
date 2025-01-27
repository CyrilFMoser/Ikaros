package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Char, Int], b: T_A[(Byte,Char), T_A[Char, Int]], c: T_A[Byte, T_A[Char, Int]]) extends T_A[Char, Int]
case class CC_B(a: (CC_A,T_A[CC_A, CC_A]), b: T_A[T_A[CC_A, (Byte,Int)], CC_A]) extends T_A[Char, Int]
case class CC_C(a: (Boolean,T_B[CC_A, CC_A]), b: Char) extends T_A[Char, Int]
case class CC_D(a: Byte) extends T_B[Int, CC_B]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(_, _), _, _), _, _) => 1 
  case CC_A(CC_A(CC_C(_, _), _, _), _, _) => 2 
  case CC_A(CC_B(_, _), _, _) => 3 
  case CC_A(CC_C((_,_), _), _, _) => 4 
  case CC_B((CC_A(_, _, _),_), _) => 5 
  case CC_C(_, _) => 6 
}
}