object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: E) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: (T_A[Int, Int]               ,Boolean )) extends T_A[F, T_A[F, F]]
case class CC_C(a:      Int , b: T_A[T_A[Int, Int], T_A[T_A[Int, Int], T_A[Int, Int]]])
val v_a: T_A[CC_C, T_A[CC_C, CC_C]] = null
val v_b      = v_a match{
  case CC_A(CC_C(_, _)) => 0
  case CC_B((_,_)) => 1
}
}
