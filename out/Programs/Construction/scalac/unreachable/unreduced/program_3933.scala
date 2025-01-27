package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Char],T_A[Int, (Char,Char)])) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C(a: T_A[CC_B[Boolean], T_A[CC_B[Boolean], CC_B[Boolean]]]) extends T_A[T_A[CC_A[Byte], T_A[CC_A[Byte], CC_A[Byte]]], T_A[T_A[Byte, Boolean], CC_A[Boolean]]]

val v_a: T_A[T_A[CC_A[Byte], T_A[CC_A[Byte], CC_A[Byte]]], T_A[T_A[Byte, Boolean], CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A((_,_))) => 0 
  case CC_C(CC_B()) => 1 
}
}