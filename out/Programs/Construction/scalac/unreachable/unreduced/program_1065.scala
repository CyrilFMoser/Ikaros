package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: T_A[T_A[Byte]], b: T_A[Byte], c: T_B[(Int,Boolean), Int]) extends T_A[Int]
case class CC_C(a: Boolean, b: CC_A[T_A[Int]], c: T_A[T_A[CC_B]]) extends T_A[T_A[T_A[Int]]]
case class CC_D[E](a: (T_A[Char],CC_A[CC_C])) extends T_B[CC_A[E], E]
case class CC_E(a: Int) extends T_B[CC_A[CC_A[Int]], CC_A[Int]]
case class CC_F[F]() extends T_B[CC_A[F], F]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
}
}