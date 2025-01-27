package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Char], T_A[Byte]], b: T_A[T_A[Byte]], c: T_A[T_B[Int, Int]]) extends T_A[(T_A[Char],T_A[(Boolean,Byte)])]
case class CC_B[D, E](a: T_A[E], b: T_B[D, D]) extends T_B[E, D]
case class CC_C[F]() extends T_B[F, T_B[F, F]]
case class CC_D() extends T_B[T_A[CC_B[Int, Byte]], T_B[T_A[CC_B[Int, Byte]], T_A[CC_B[Int, Byte]]]]

val v_a: T_B[T_A[CC_B[Int, Byte]], T_B[T_A[CC_B[Int, Byte]], T_A[CC_B[Int, Byte]]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_B(_, _))) => 0 
  case CC_C() => 1 
  case CC_D() => 2 
}
}