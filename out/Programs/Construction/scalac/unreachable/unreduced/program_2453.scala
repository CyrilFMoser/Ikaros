package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[Char, T_A[(Char,Int), Byte]], C]
case class CC_B(a: CC_A[CC_A[T_B]], b: T_A[T_B, Byte]) extends T_B
case class CC_C(a: (T_B,T_B), b: CC_A[T_B]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
  case CC_C((CC_B(_, _),CC_B(_, _)), _) => 1 
  case CC_C((CC_B(_, _),CC_C(_, _)), _) => 2 
  case CC_C((CC_B(_, _),CC_D()), _) => 3 
  case CC_C((CC_C(_, _),CC_B(_, _)), _) => 4 
  case CC_C((CC_C(_, _),CC_C(_, _)), _) => 5 
  case CC_C((CC_C(_, _),CC_D()), _) => 6 
  case CC_C((CC_D(),CC_B(_, _)), _) => 7 
  case CC_C((CC_D(),CC_C(_, _)), _) => 8 
  case CC_C((CC_D(),CC_D()), _) => 9 
  case CC_D() => 10 
}
}