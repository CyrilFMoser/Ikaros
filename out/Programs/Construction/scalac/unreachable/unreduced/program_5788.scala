package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,T_A[Int, (Boolean,Int)]), b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_A(_, CC_A(_, _))) => 0 
  case CC_A((_,_), CC_A(_, CC_B())) => 1 
  case CC_A((_,_), CC_B()) => 2 
  case CC_B() => 3 
}
}