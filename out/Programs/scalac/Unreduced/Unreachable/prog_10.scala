object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: D, c: T_A[D, D]) extends T_A[D, T_A[T_A[T_B[Char], T_B[Byte]], T_B[T_A[Int, Byte]]]]
case class CC_B[E](a: T_A[E, T_A[T_A[T_B[Char], T_B[Byte]], T_B[T_A[Int, Byte]]]]) extends T_A[E, T_A[T_A[T_B[Char], T_B[Byte]], T_B[T_A[Int, Byte]]]]
case class CC_C[F](a: T_B[F], b: F) extends T_B[F]
case class CC_D[G](a: T_A[G, G], b: Byte, c: T_A[G, G]) extends T_B[G]
case class CC_E(a: Char) extends T_B[T_B[CC_B[T_A[Boolean, T_A[T_A[T_B[Char], T_B[Byte]], T_B[T_A[Int, Byte]]]]]]]
case class CC_F() extends T_B[T_B[CC_B[T_A[Boolean, T_A[T_A[T_B[Char], T_B[Byte]], T_B[T_A[Int, Byte]]]]]]]
case class CC_G(a: CC_B[Int]) extends T_B[T_B[CC_B[T_A[Boolean, T_A[T_A[T_B[Char], T_B[Byte]], T_B[T_A[Int, Byte]]]]]]]
case class CC_H(a: CC_D[CC_G], b: CC_D[CC_A[T_B[Byte]]]) extends T_B[T_B[T_A[Int, CC_C[Int]]]]
case class CC_I() extends T_B[T_B[T_A[Int, CC_C[Int]]]]
case class CC_J(a: T_A[T_B[T_B[T_A[Int, CC_C[Int]]]], T_A[T_A[T_B[Char], T_B[Byte]], T_B[T_A[Int, Byte]]]], b: Boolean) extends T_B[T_B[T_A[Int, CC_C[Int]]]]

val v_a: T_B[T_B[CC_B[T_A[Boolean, T_A[T_A[T_B[Char], T_B[Byte]], T_B[T_A[Int, Byte]]]]]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _), _) => 0 
  case CC_C(CC_D(_, _, _), _) => 1 
  case CC_C(CC_E(_), _) => 2 
  case CC_C(CC_F(), _) => 3 
  case CC_C(CC_G(_), _) => 4 
  case CC_D(_, _, _) => 5 
  case CC_E(_) => 6 
  case CC_F() => 7 
  case CC_G(CC_B(_)) => 8 
}
}