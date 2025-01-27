package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E], b: T_A[E, T_A[D, E]]) extends T_A[D, E]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C[H, I](a: CC_A[H, I], b: Int) extends T_A[H, I]
case class CC_D(a: T_B[T_A[(Char,Byte), Char]]) extends T_B[T_A[T_A[Byte, Char], T_A[Boolean, Char]]]
case class CC_E(a: T_A[T_A[CC_D, CC_D], (CC_D,Boolean)], b: (T_A[CC_D, CC_D],T_A[CC_D, Boolean]), c: T_A[(CC_D,CC_D), T_B[Byte]]) extends T_B[T_A[T_A[Byte, Char], T_A[Boolean, Char]]]
case class CC_F() extends T_B[T_A[T_A[Byte, Char], T_A[Boolean, Char]]]

val v_a: T_A[Int, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _)