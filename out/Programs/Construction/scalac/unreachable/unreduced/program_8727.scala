package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_B[T_B[Byte]]]
case class CC_B[E](a: CC_A[T_A[E, E]]) extends T_A[E, T_B[T_B[Byte]]]
case class CC_C(a: CC_B[CC_B[Boolean]], b: T_A[T_A[Char, Boolean], T_A[Char, Byte]], c: T_B[T_B[Byte]]) extends T_A[T_B[T_A[Int, Boolean]], T_B[T_B[Byte]]]
case class CC_D() extends T_B[Char]
case class CC_E(a: CC_A[Int]) extends T_B[Char]
case class CC_F(a: Byte, b: Byte, c: CC_C) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(_)) => 1 
  case CC_F(_, _, CC_C(_, _, _)) => 2 
}
}