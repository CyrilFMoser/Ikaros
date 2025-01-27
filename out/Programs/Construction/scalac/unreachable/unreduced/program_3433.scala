package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Boolean,T_B[Char, Byte]), b: Char) extends T_A[E, T_B[T_B[Boolean, Byte], T_A[Char, Byte]]]
case class CC_B[F](a: (T_A[Int, Boolean],CC_A[Byte])) extends T_A[F, T_B[T_B[Boolean, Byte], T_A[Char, Byte]]]

val v_a: T_A[Char, T_B[T_B[Boolean, Byte], T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B((_,CC_A(_, _))) => 1 
}
}