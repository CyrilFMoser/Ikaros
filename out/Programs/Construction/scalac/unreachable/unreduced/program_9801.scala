package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Int], T_A[Char]], b: (T_B[Boolean, Boolean],T_A[Byte])) extends T_A[T_B[Char, T_A[(Char,Byte)]]]
case class CC_B(a: T_B[CC_A, Int]) extends T_A[T_B[Char, T_A[(Char,Byte)]]]
case class CC_C[D]() extends T_A[D]
case class CC_D[E](a: E, b: CC_C[E]) extends T_B[E, CC_B]
case class CC_E(a: CC_D[T_A[CC_B]]) extends T_B[T_A[CC_A], CC_B]
case class CC_F[F]() extends T_B[CC_A, F]

val v_a: T_A[T_B[Char, T_A[(Char,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_C())) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}