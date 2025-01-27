package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[E, D]
case class CC_B[F](a: T_B[F], b: Boolean, c: Char) extends T_A[F, T_B[F]]
case class CC_C(a: T_A[T_B[Boolean], Char]) extends T_B[Byte]
case class CC_D(a: (CC_B[Boolean],Int)) extends T_B[Byte]
case class CC_E(a: CC_B[T_A[CC_D, (Boolean,Char)]]) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_D((CC_B(_, _, _),_)) => 1 
}
}
// This is not matched: CC_E(_)