package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: Char) extends T_A[E, T_B[T_B[Boolean, Byte], T_A[Boolean, Byte]]]
case class CC_B[F, G](a: G, b: F) extends T_A[F, T_B[T_B[Boolean, Byte], T_A[Boolean, Byte]]]
case class CC_C(a: T_A[((Boolean,Boolean),Byte), Char]) extends T_A[CC_B[T_B[Byte, Char], CC_A[Boolean]], T_A[T_A[Int, Char], Byte]]
case class CC_D[H](a: T_B[Char, H], b: CC_A[H]) extends T_B[Char, H]

val v_a: T_A[Char, T_B[T_B[Boolean, Byte], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}