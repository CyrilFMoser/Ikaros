package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_B[F](a: T_B[F], b: F, c: Byte) extends T_A[CC_A[F, F], F]
case class CC_C(a: CC_A[CC_A[Char, Boolean], T_A[Byte, Byte]], b: T_B[CC_A[Char, Byte]]) extends T_B[T_A[CC_B[(Boolean,Boolean)], T_A[Int, Boolean]]]
case class CC_D() extends T_B[T_A[CC_B[(Boolean,Boolean)], T_A[Int, Boolean]]]
case class CC_E(a: CC_B[Char], b: CC_C) extends T_B[T_A[CC_B[(Boolean,Boolean)], T_A[Int, Boolean]]]

val v_a: T_B[T_A[CC_B[(Boolean,Boolean)], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _) => 0 
  case CC_D() => 1 
  case CC_E(CC_B(_, _, _), CC_C(CC_A(), _)) => 2 
}
}