package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Byte, b: T_B[E], c: Int) extends T_A[E, D]
case class CC_B[G, F]() extends T_A[F, G]
case class CC_C[H, I](a: CC_A[H, H]) extends T_A[H, I]
case class CC_D(a: Int, b: T_A[T_B[Int], T_A[Char, Byte]], c: CC_A[T_A[Byte, Int], CC_A[Char, Int]]) extends T_B[T_A[T_B[Char], CC_A[Int, (Char,Byte)]]]

val v_a: T_A[Int, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, 12)) => 2 
  case CC_C(CC_A(_, _, _)) => 3 
}
}