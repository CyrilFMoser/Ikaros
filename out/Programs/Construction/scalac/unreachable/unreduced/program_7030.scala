package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Boolean, b: T_A[(Boolean,Char)], c: T_B[T_A[Int]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[T_A[(Int,Int)]]) extends T_A[T_B[CC_A]]
case class CC_C() extends T_A[T_A[T_A[Byte]]]
case class CC_D[C](a: CC_B, b: T_A[T_B[CC_A]], c: CC_B) extends T_B[C]
case class CC_E[D](a: D, b: CC_D[D]) extends T_B[D]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_), CC_B(_), _) => 0 
  case CC_E(CC_C(), CC_D(_, _, _)) => 1 
}
}