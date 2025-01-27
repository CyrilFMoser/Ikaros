package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[T_A, (Byte,Char)]], b: Int) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_B[C, C], b: C) extends T_B[C, T_B[C, C]]
case class CC_D[D](a: T_B[D, T_B[D, D]]) extends T_B[D, T_B[D, D]]
case class CC_E[E]() extends T_B[E, (CC_A,T_A)]

val v_a: T_B[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_C(_, _)) => 1 
  case CC_D(CC_D(CC_C(_, _))) => 2 
  case CC_D(CC_D(CC_D(_))) => 3 
}
}