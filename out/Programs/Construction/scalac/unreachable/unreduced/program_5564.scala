package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Byte, C]
case class CC_B(a: Int, b: CC_A[Char]) extends T_A[Byte, T_A[Byte, ((Int,Char),Int)]]
case class CC_C[D](a: T_A[D, D], b: ((CC_B,CC_B),CC_A[CC_B]), c: T_A[Byte, D]) extends T_A[Byte, D]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, ((_,_),CC_A()), CC_A()) => 1 
  case CC_C(_, ((_,_),CC_A()), CC_C(_, (_,_), _)) => 2 
}
}