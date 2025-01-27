package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D], b: T_A[D, C], c: C) extends T_A[C, Byte]
case class CC_B[E](a: Boolean, b: (CC_A[Char, Byte],T_A[Int, Byte])) extends T_A[E, Byte]
case class CC_C[F](a: T_A[F, Byte], b: F) extends T_A[F, Byte]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}