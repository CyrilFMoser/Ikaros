package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Boolean,Int)], b: T_A[T_A[Byte]], c: Char) extends T_A[(T_A[(Int,Char)],T_A[Byte])]
case class CC_B[C](a: (T_B[CC_A],CC_A), b: T_B[C], c: C) extends T_B[C]
case class CC_C[D](a: T_A[D]) extends T_B[D]
case class CC_D(a: (CC_B[CC_A],CC_A)) extends T_B[T_B[CC_C[CC_A]]]

val v_a: T_B[T_A[(T_A[(Int,Char)],T_A[Byte])]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}
// This is not matched: CC_B(_, _, _)