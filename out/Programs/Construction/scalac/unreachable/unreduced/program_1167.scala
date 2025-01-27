package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[T_A[Boolean, Byte]], T_B[Boolean]]
case class CC_B(a: T_B[CC_A], b: T_A[CC_A, T_B[CC_A]]) extends T_A[T_B[T_A[Boolean, Byte]], T_B[Boolean]]
case class CC_C[D, E](a: T_B[D], b: T_A[D, E]) extends T_B[D]
case class CC_D[F]() extends T_B[F]

val v_a: T_A[T_B[T_A[Boolean, Byte]], T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C(_, _), _) => 1 
  case CC_B(CC_D(), _) => 2 
}
}