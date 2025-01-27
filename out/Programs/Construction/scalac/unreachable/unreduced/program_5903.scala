package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D], c: D) extends T_A[D]
case class CC_B[E, F]() extends T_A[E]
case class CC_C[G]() extends T_A[G]
case class CC_D[H](a: H, b: H) extends T_B[H, T_B[H, H]]
case class CC_E(a: T_B[T_A[Boolean], T_B[T_A[Boolean], T_A[Boolean]]], b: T_A[((Char,Byte),Int)]) extends T_B[Char, T_B[Char, Char]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}