package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, Int], b: T_A[E, Int]) extends T_A[E, Int]
case class CC_B(a: CC_A[T_A[Boolean, Int]], b: T_A[T_A[Int, Int], (Char,Byte)], c: Char) extends T_A[CC_A[T_A[Char, Byte]], Int]
case class CC_C(a: CC_A[(CC_B,Char)], b: CC_B, c: CC_A[Boolean]) extends T_A[CC_A[T_A[Char, Byte]], Int]
case class CC_D[F, G]() extends T_B[G, F]

val v_a: T_A[CC_A[T_A[Char, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _, _), _) => 1 
  case CC_A(CC_C(_, _, _), _) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_B(_, _, _)