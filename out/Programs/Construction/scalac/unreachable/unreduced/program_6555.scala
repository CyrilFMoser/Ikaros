package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_A[(Char,Char), Boolean],T_A[Char, Char]), b: T_A[D, D], c: D) extends T_A[T_B[T_B[Char]], D]
case class CC_B[E](a: T_B[T_B[E]], b: T_A[CC_A[E], E], c: T_B[E]) extends T_A[T_B[T_B[Char]], E]
case class CC_C(a: CC_B[Byte]) extends T_A[T_B[T_B[Char]], T_B[CC_B[(Int,Int)]]]
case class CC_D[F](a: CC_B[F]) extends T_B[F]
case class CC_E(a: CC_A[(CC_C,CC_C)], b: T_B[T_B[Int]]) extends T_B[T_B[Int]]
case class CC_F() extends T_B[T_B[Int]]

val v_a: T_B[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_A(_, _, _), CC_D(CC_B(_, _, _))) => 1 
  case CC_E(CC_A(_, _, _), CC_E(_, CC_D(_))) => 2 
  case CC_E(CC_A(_, _, _), CC_E(_, CC_E(_, _))) => 3 
  case CC_E(CC_A(_, _, _), CC_E(_, CC_F())) => 4 
  case CC_F() => 5 
}
}
// This is not matched: CC_E(CC_A(_, _, _), CC_F())