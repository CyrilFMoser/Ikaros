package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E]) extends T_A[E, T_A[T_B[Byte, (Byte,Int)], T_A[Char, Int]]]
case class CC_B[F](a: T_B[F, F], b: F) extends T_A[T_B[T_A[F, F], F], F]
case class CC_C(a: T_B[CC_B[Int], T_B[Char, (Char,Byte)]], b: T_B[T_A[Byte, Boolean], T_A[Boolean, Boolean]], c: T_B[CC_B[Char], CC_B[Boolean]]) extends T_A[T_B[T_A[CC_B[T_A[Char, Char]], CC_B[T_A[Char, Char]]], CC_B[T_A[Char, Char]]], CC_B[T_A[Char, Char]]]
case class CC_D[H, G](a: CC_C, b: Byte) extends T_B[G, H]

val v_a: T_A[T_B[T_A[CC_B[T_A[Char, Char]], CC_B[T_A[Char, Char]]], CC_B[T_A[Char, Char]]], CC_B[T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_D(_, _), CC_B(CC_D(_, _), _)) => 0 
  case CC_C(_, CC_D(_, _), _) => 1 
}
}