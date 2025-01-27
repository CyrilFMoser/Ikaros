package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Boolean],T_B[Char, (Boolean,Int)]), b: T_B[T_B[Byte, Byte], (Char,Byte)], c: Int) extends T_A[T_A[Int]]
case class CC_B[D](a: (T_B[CC_A, CC_A],T_A[CC_A]), b: CC_A, c: D) extends T_A[D]
case class CC_C() extends T_A[T_A[Int]]
case class CC_D[E](a: E, b: CC_A) extends T_B[E, (Char,CC_B[CC_C])]
case class CC_E[F](a: T_A[F], b: T_A[F]) extends T_B[F, (Char,CC_B[CC_C])]

val v_a: T_B[Boolean, (Char,CC_B[CC_C])] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_B(_, CC_A(_, _, _), true), _) => 1 
  case CC_E(CC_B(_, CC_A(_, _, _), false), _) => 2 
}
}