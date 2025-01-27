package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[D, E]
case class CC_B[F](a: T_A[F, F], b: T_B[F], c: Char) extends T_A[Char, F]
case class CC_C[G](a: T_A[Char, G], b: G) extends T_A[Char, G]
case class CC_D() extends T_B[T_A[T_A[Char, Byte], T_A[(Int,Byte), Boolean]]]
case class CC_E() extends T_B[Byte]

val v_a: CC_C[T_B[T_A[T_A[Char, Byte], T_A[(Int,Byte), Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_D()) => 0 
  case CC_C(CC_B(CC_A(), _, _), CC_D()) => 1 
  case CC_C(CC_C(CC_A(), _), CC_D()) => 2 
  case CC_C(CC_C(CC_B(_, _, _), _), CC_D()) => 3 
  case CC_C(CC_C(CC_C(_, _), _), CC_D()) => 4 
}
}