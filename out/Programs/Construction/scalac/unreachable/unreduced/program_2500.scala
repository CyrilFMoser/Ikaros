package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D, E](a: Int, b: E) extends T_A[D]
case class CC_C[F](a: (T_B[Boolean],CC_B[(Int,Int), Byte])) extends T_A[F]
case class CC_D(a: T_A[Byte], b: T_A[T_B[Boolean]], c: ((Boolean,Boolean),T_A[Char])) extends T_B[T_A[Char]]
case class CC_E(a: T_A[CC_A[CC_D]]) extends T_B[T_A[Char]]
case class CC_F() extends T_B[T_A[Char]]

val v_a: T_A[CC_F] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C((_,CC_B(_, _))) => 1 
}
}
// This is not matched: CC_A()