package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: T_B[E, (Byte,Int)], b: CC_A[E], c: T_B[E, E]) extends T_B[E, ((Char,Char),CC_A[Boolean])]
case class CC_C[F](a: CC_B[F]) extends T_B[F, ((Char,Char),CC_A[Boolean])]
case class CC_D(a: T_A[CC_C[Boolean]], b: Int) extends T_B[T_B[Int, (Char,Byte)], ((Char,Char),CC_A[Boolean])]

val v_a: T_B[T_B[Int, (Char,Byte)], ((Char,Char),CC_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
  case CC_D(_, _) => 2 
}
}