package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[T_A[(Byte,Int), T_A[(Byte,Int), (Byte,Int)]], T_A[T_A[(Byte,Int), T_A[(Byte,Int), (Byte,Int)]], T_A[(Byte,Int), T_A[(Byte,Int), (Byte,Int)]]]]
case class CC_C[D](a: (T_A[CC_B, CC_B],T_A[Byte, Char]), b: CC_A[D], c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]

val v_a: T_A[T_A[(Byte,Int), T_A[(Byte,Int), (Byte,Int)]], T_A[T_A[(Byte,Int), T_A[(Byte,Int), (Byte,Int)]], T_A[(Byte,Int), T_A[(Byte,Int), (Byte,Int)]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B())) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B()) => 3 
  case CC_A(CC_C((_,_), CC_A(_), CC_A(_))) => 4 
  case CC_A(CC_C((_,_), CC_A(_), CC_B())) => 5 
  case CC_A(CC_C((_,_), CC_A(_), CC_C(_, _, _))) => 6 
  case CC_B() => 7 
  case CC_C((_,_), CC_A(_), _) => 8 
}
}