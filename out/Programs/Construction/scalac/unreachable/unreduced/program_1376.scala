package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[(Boolean,Int), (Byte,Byte)]]
case class CC_B[D](a: (CC_A[(Boolean,Boolean)],T_A[Boolean, Int]), b: CC_A[D], c: T_A[D, D]) extends T_A[D, T_A[(Boolean,Int), (Byte,Byte)]]
case class CC_C[E](a: CC_A[E], b: CC_B[E], c: T_A[E, E]) extends T_A[E, T_A[(Boolean,Int), (Byte,Byte)]]

val v_a: T_A[Byte, T_A[(Boolean,Int), (Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(), _, _) => 2 
}
}