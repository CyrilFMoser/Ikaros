package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: CC_A[D]) extends T_A[D]
case class CC_C(a: T_B[(Char,Boolean)], b: (Char,Int), c: T_B[Byte]) extends T_A[T_A[Byte]]
case class CC_D() extends T_B[T_A[CC_B[CC_C]]]
case class CC_E() extends T_B[T_A[CC_B[CC_C]]]
case class CC_F(a: T_A[T_A[Byte]], b: T_A[CC_C], c: T_A[(CC_C,CC_C)]) extends T_B[T_A[CC_B[CC_C]]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_C(_, _, _) => 2 
}
}