package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[(Byte,Char)], b: ((Boolean,Int),Boolean)) extends T_A[Boolean]
case class CC_B[D, E](a: T_A[D]) extends T_B[E, D]
case class CC_C[F](a: F) extends T_B[Char, F]

val v_a: T_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, (_,_))) => 0 
  case CC_C(_) => 1 
}
}