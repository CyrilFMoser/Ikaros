package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Byte, Int], T_A[Byte, Boolean]]]
case class CC_B[D](a: (CC_A[(Byte,Byte)],T_A[Boolean, Byte]), b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[T_A[Byte, Int], T_A[Byte, Boolean]]]

val v_a: T_A[Char, T_A[T_A[Byte, Int], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_), _) => 1 
}
}