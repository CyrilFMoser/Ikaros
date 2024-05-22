object Test{
sealed trait T_A[A, B]
case class CC_A[A](a: Int, b: T_A[A, T_A[A, A]], c: T_A[A, A])
    extends T_A[A, T_A[A, A]]
case class CC_B[A]() extends T_A[T_A[Int, T_A[Int, Int]], T_A[A, A]]
case class CC_C[A, C](a: CC_A[C]) extends T_A[A, T_A[A, A]]
case class CC_D[A](a: CC_B[A], b: T_A[A, A], c: T_A[A, T_A[A, A]])
    extends T_A[T_A[Int, T_A[Int, Int]], T_A[A, A]]
case class CC_E[A]() extends T_A[T_A[Int, T_A[Int, Int]], T_A[A, A]]
case class CC_F[A](a: Char) extends T_A[T_A[Int, T_A[Int, Int]], T_A[A, A]]
case class CC_G[B]() extends T_A[CC_E[Int], B]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match {
  case CC_A(_, _, _) => 0
  case CC_C(_)       => 1
  case CC_B()        => 2
  case CC_D(_, _, _) => 3
  case CC_E()        => 4
  case CC_F(_)       => 5
  case CC_G()        => 6
}
}