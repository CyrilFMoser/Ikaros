package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[Char, C], b: T_A[C, C], c: C) extends T_A[Char, C]
case class CC_B(a: T_A[Char, T_A[(Char,Byte), T_B]], b: T_A[Char, Char]) extends T_A[Char, T_A[Char, T_A[T_B, T_B]]]
case class CC_C[D](a: Char) extends T_A[Char, D]
case class CC_D(a: Byte) extends T_B
case class CC_E(a: T_A[Char, T_A[Char, (Char,Boolean)]]) extends T_B

val v_a: T_A[Char, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, CC_D(_)), _, CC_D(0)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_D(_)), _, CC_D(_)) => 1 
  case CC_A(CC_A(CC_C(_), _, CC_D(_)), _, CC_D(0)) => 2 
  case CC_A(CC_A(CC_C(_), _, CC_D(_)), _, CC_D(_)) => 3 
  case CC_A(CC_C(_), _, CC_D(0)) => 4 
  case CC_A(CC_C(_), _, CC_D(_)) => 5 
  case CC_C(_) => 6 
}
}