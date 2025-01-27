package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E]) extends T_A[E, D]
case class CC_B[G, F]() extends T_A[F, G]
case class CC_C(a: Boolean, b: T_A[CC_B[Int, Boolean], Int]) extends T_B[CC_B[T_B[Char], T_A[Char, Byte]]]
case class CC_D(a: CC_C, b: Byte, c: (Boolean,T_A[CC_C, CC_C])) extends T_B[CC_B[T_B[Char], T_A[Char, Byte]]]
case class CC_E(a: T_B[CC_B[CC_D, CC_D]]) extends T_B[CC_B[T_B[Char], T_A[Char, Byte]]]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}