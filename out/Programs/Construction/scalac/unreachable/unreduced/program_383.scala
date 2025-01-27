package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Boolean, b: T_B[D]) extends T_A[E, D]
case class CC_B[G, F](a: Int, b: T_A[G, F]) extends T_A[F, G]
case class CC_C[H, I](a: H, b: H) extends T_A[H, CC_B[T_A[Int, (Int,Char)], T_A[Byte, Byte]]]
case class CC_D(a: T_A[T_A[Char, Char], T_A[Byte, Char]], b: T_A[T_A[Byte, Int], CC_B[(Int,Boolean), Char]]) extends T_B[CC_C[T_B[Char], Boolean]]

val v_a: T_A[Char, CC_B[T_A[Int, (Int,Char)], T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_C(_, _) => 3 
}
}