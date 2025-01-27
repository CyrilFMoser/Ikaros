package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_A[Byte],T_A[Byte]), b: T_B[Char, D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: Byte) extends T_A[E]
case class CC_C[F](a: F) extends T_A[F]
case class CC_D[G](a: T_A[G], b: T_A[G]) extends T_B[(T_A[Boolean],Int), G]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),CC_A(_, _)), _) => 0 
  case CC_A((CC_A(_, _),CC_B(_, _)), _) => 1 
  case CC_A((CC_A(_, _),CC_C(_)), _) => 2 
  case CC_A((CC_B(_, _),CC_A(_, _)), _) => 3 
  case CC_A((CC_B(_, _),CC_B(_, _)), _) => 4 
  case CC_A((CC_B(_, _),CC_C(_)), _) => 5 
  case CC_A((CC_C(_),CC_A(_, _)), _) => 6 
  case CC_A((CC_C(_),CC_B(_, _)), _) => 7 
  case CC_A((CC_C(_),CC_C(_)), _) => 8 
  case CC_B(_, _) => 9 
  case CC_C(_) => 10 
}
}