package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: D) extends T_A[D]
case class CC_B[F](a: CC_A[F, F], b: T_B[F, F], c: F) extends T_A[F]
case class CC_C[G](a: T_A[G]) extends T_B[G, T_B[G, G]]
case class CC_D(a: ((Char,Int),CC_B[Int]), b: Int, c: (T_A[Byte],Boolean)) extends T_B[T_A[(Boolean,Char)], T_B[T_A[(Boolean,Char)], T_A[(Boolean,Char)]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}