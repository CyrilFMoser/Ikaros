package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D, E](a: (T_A[Char, Char],Byte), b: CC_A[E], c: D) extends T_A[T_A[D, D], D]
case class CC_C[F](a: CC_B[F, F]) extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,0), _, _) => 1 
  case CC_B((_,_), _, _) => 2 
  case CC_C(CC_B((_,_), CC_A(), 0)) => 3 
  case CC_C(CC_B((_,_), CC_A(), _)) => 4 
}
}