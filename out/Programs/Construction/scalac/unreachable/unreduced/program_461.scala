package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Boolean, Boolean], T_B[Byte, Boolean]]) extends T_A[T_B[T_B[Boolean, Int], T_B[Byte, (Byte,Char)]], T_A[T_B[Char, Int], T_A[Int, Byte]]]
case class CC_B(a: T_A[T_A[CC_A, CC_A], T_A[(Boolean,Boolean), Char]], b: Byte) extends T_A[T_B[T_B[Boolean, Int], T_B[Byte, (Byte,Char)]], T_A[T_B[Char, Int], T_A[Int, Byte]]]
case class CC_C[F, E](a: Char, b: T_B[F, E]) extends T_B[F, E]
case class CC_D[G, H](a: (CC_C[(Int,Byte), CC_B],CC_A), b: H) extends T_B[H, G]
case class CC_E[J, I](a: T_B[I, I], b: CC_B) extends T_B[I, J]

val v_a: T_A[T_B[T_B[Boolean, Int], T_B[Byte, (Byte,Char)]], T_A[T_B[Char, Int], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _)) => 0 
  case CC_A(CC_D(_, _)) => 1 
  case CC_A(CC_E(_, _)) => 2 
  case CC_B(_, _) => 3 
}
}