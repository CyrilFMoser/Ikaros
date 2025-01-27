package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_B[Char],T_A[Int]), b: Int, c: T_A[T_A[(Boolean,Char)]]) extends T_A[(T_B[Byte],Char)]
case class CC_B[C](a: C, b: T_A[C]) extends T_B[C]
case class CC_C[D](a: T_B[D], b: Char, c: (T_B[CC_A],Char)) extends T_B[D]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _, _) => 1 
}
}