package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, Char]]) extends T_A[T_B[T_B[Byte, Boolean], T_B[Int, Int]]]
case class CC_B(a: Byte, b: T_B[Char, Boolean]) extends T_A[T_B[T_B[Byte, Boolean], T_B[Int, Int]]]
case class CC_C(a: CC_A, b: (T_B[CC_B, CC_B],T_A[CC_B])) extends T_A[T_B[T_B[Byte, Boolean], T_B[Int, Int]]]
case class CC_D[D](a: CC_C, b: Boolean, c: CC_C) extends T_B[D, CC_C]
case class CC_E[F, E](a: CC_B, b: T_A[F]) extends T_B[E, F]
case class CC_F() extends T_B[CC_C, CC_C]

val v_a: T_B[CC_A, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_, true, _) => 0 
  case CC_D(_, false, _) => 1 
  case CC_E(CC_B(_, CC_E(_, _)), _) => 2 
}
}