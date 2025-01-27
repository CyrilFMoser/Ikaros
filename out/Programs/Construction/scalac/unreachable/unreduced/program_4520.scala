package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B() extends T_B
case class CC_C(a: T_A[T_B, (Char,Char)], b: (T_B,T_A[T_B, (Byte,Int)])) extends T_B
case class CC_D(a: T_A[Char, CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(), (CC_B(),CC_A())) => 1 
  case CC_C(CC_A(), (CC_C(_, _),CC_A())) => 2 
  case CC_C(CC_A(), (CC_D(_),CC_A())) => 3 
  case CC_D(_) => 4 
}
}