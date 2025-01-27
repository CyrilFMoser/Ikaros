package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte, b: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[E](a: E, b: CC_A[E], c: E) extends T_A[E, T_B[E]]
case class CC_C(a: CC_A[T_A[Int, (Int,Boolean)]]) extends T_A[T_A[T_A[Char, Int], T_B[T_A[Char, Int]]], T_B[T_A[T_A[Char, Int], T_B[T_A[Char, Int]]]]]
case class CC_D[F]() extends T_B[F]
case class CC_E() extends T_B[T_A[Boolean, T_B[Boolean]]]

val v_a: T_A[T_A[T_A[Char, Int], T_B[T_A[Char, Int]]], T_B[T_A[T_A[Char, Int], T_B[T_A[Char, Int]]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D()) => 0 
  case CC_B(CC_A(_, CC_D()), CC_A(_, _), _) => 1 
  case CC_B(CC_B(_, CC_A(_, _), _), CC_A(_, _), _) => 2 
  case CC_C(CC_A(_, _)) => 3 
}
}