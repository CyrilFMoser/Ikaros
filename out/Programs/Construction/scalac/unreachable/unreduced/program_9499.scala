package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[E], b: T_A[D, E]) extends T_A[E, D]
case class CC_B[F](a: T_A[Int, F]) extends T_A[Int, F]
case class CC_C(a: CC_B[CC_A[Byte, Int]], b: T_A[Boolean, T_B[Int]]) extends T_B[T_A[CC_B[Boolean], Int]]
case class CC_D(a: T_A[(CC_C,CC_C), CC_C]) extends T_B[T_A[CC_B[Boolean], Int]]
case class CC_E(a: CC_A[Byte, CC_C], b: T_A[Int, T_A[Int, CC_C]], c: (T_A[Int, CC_D],T_A[Int, CC_D])) extends T_B[T_A[CC_B[Boolean], Int]]

val v_a: T_B[T_A[CC_B[Boolean], Int]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_), CC_A(_, CC_A(_, _))) => 0 
  case CC_D(CC_A(_, CC_A(_, _))) => 1 
  case CC_E(_, _, (CC_A(_, _),CC_A(_, _))) => 2 
  case CC_E(_, _, (CC_A(_, _),CC_B(_))) => 3 
  case CC_E(_, _, (CC_B(_),CC_A(_, _))) => 4 
  case CC_E(_, _, (CC_B(_),CC_B(_))) => 5 
}
}