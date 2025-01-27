package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[T_A[Boolean, T_B[Int]], D]
case class CC_B[F](a: F, b: (T_B[Byte],CC_A[Boolean, Char])) extends T_B[F]
case class CC_C[G](a: T_A[G, G], b: T_B[G], c: T_B[G]) extends T_B[G]
case class CC_D[H](a: Char) extends T_B[H]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12, (CC_B(_, _),CC_A())) => 0 
  case CC_B(_, (CC_B(_, _),CC_A())) => 1 
  case CC_B(12, (CC_C(_, _, _),CC_A())) => 2 
  case CC_B(_, (CC_C(_, _, _),CC_A())) => 3 
  case CC_B(12, (CC_D(_),CC_A())) => 4 
  case CC_B(_, (CC_D(_),CC_A())) => 5 
  case CC_C(_, CC_B(_, _), _) => 6 
  case CC_C(_, CC_C(_, _, _), _) => 7 
  case CC_C(_, CC_D(_), _) => 8 
  case CC_D(_) => 9 
}
}