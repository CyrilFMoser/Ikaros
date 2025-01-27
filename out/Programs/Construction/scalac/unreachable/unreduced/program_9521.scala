package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: (CC_A[(Char,Byte)],T_A[Boolean, Int]), b: T_A[T_A[Char, D], T_A[T_A[Char, D], T_A[Char, D]]], c: CC_A[D]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_), CC_A(), CC_A()) => 1 
  case CC_B((CC_A(),_), CC_B(_, _, _), CC_A()) => 2 
}
}