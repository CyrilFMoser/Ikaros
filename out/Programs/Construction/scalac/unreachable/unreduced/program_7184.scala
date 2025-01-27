package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[T_B[Byte]], D]
case class CC_B[E](a: T_B[E], b: T_A[E, E], c: E) extends T_A[T_B[T_B[Byte]], E]
case class CC_C(a: T_A[CC_A[Int], Byte], b: CC_B[T_A[Boolean, (Char,Boolean)]]) extends T_A[T_B[T_B[Byte]], CC_B[CC_B[Boolean]]]
case class CC_D[F]() extends T_B[F]

val v_a: T_A[T_B[T_B[Byte]], T_A[T_B[T_B[Byte]], CC_B[CC_B[Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}