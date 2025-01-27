package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_A[Char, Byte],(Boolean,Char)), b: E) extends T_A[T_B[E, E], E]
case class CC_B[F](a: F, b: (CC_A[(Int,Byte)],T_A[(Boolean,Int), Int]), c: F) extends T_A[T_B[F, F], F]
case class CC_C(a: Byte, b: CC_B[Boolean]) extends T_A[T_B[T_B[T_B[(Byte,Byte), Byte], T_A[Byte, Char]], T_B[T_B[(Byte,Byte), Byte], T_A[Byte, Char]]], T_B[T_B[(Byte,Byte), Byte], T_A[Byte, Char]]]

val v_a: T_A[T_B[T_B[T_B[(Byte,Byte), Byte], T_A[Byte, Char]], T_B[T_B[(Byte,Byte), Byte], T_A[Byte, Char]]], T_B[T_B[(Byte,Byte), Byte], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, (CC_A(_, _),_), _) => 1 
}
}
// This is not matched: CC_C(_, _)