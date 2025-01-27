package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[(Byte,Int), T_B[Int, (Int,Int)]], b: Int, c: T_B[T_A[Byte, (Byte,Char)], T_A[Boolean, Int]]) extends T_A[(T_A[Boolean, Int],T_A[Byte, Char]), T_A[T_A[Byte, Boolean], T_A[Byte, Char]]]
case class CC_B(a: T_B[CC_A, CC_A]) extends T_A[(T_A[Boolean, Int],T_A[Byte, Char]), T_A[T_A[Byte, Boolean], T_A[Byte, Char]]]
case class CC_C() extends T_A[(T_A[Boolean, Int],T_A[Byte, Char]), T_A[T_A[Byte, Boolean], T_A[Byte, Char]]]
case class CC_D[E](a: Boolean, b: Char) extends T_B[E, CC_A]
case class CC_E[F](a: Boolean, b: CC_A, c: CC_B) extends T_B[F, CC_A]
case class CC_F[G]() extends T_B[G, CC_A]

val v_a: T_B[CC_C, CC_A] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_A(_, _, _), CC_B(_)) => 0 
  case CC_F() => 1 
}
}
// This is not matched: CC_D(_, _)