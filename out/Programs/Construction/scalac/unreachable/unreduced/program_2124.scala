package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, T_B[T_A[F, F], Int]]) extends T_A[F, E]
case class CC_B[I, H](a: T_B[H, H], b: T_B[H, I]) extends T_A[H, I]
case class CC_C(a: Char, b: T_A[CC_A[(Boolean,Byte), Int], CC_A[Boolean, Int]]) extends T_B[T_A[(Byte,(Char,Boolean)), CC_A[Char, Byte]], T_A[CC_B[Char, Char], CC_B[Boolean, Int]]]

val v_a: T_B[T_A[(Byte,(Char,Boolean)), CC_A[Char, Byte]], T_A[CC_B[Char, Char], CC_B[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_)) => 0 
  case CC_C(_, CC_B(_, _)) => 1 
}
}