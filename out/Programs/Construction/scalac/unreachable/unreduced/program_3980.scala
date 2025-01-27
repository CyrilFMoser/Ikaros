package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_A[Byte],T_B)]
case class CC_B(a: T_B, b: (T_B,T_A[CC_A])) extends T_A[(T_A[Byte],T_B)]
case class CC_C(a: CC_A, b: (CC_B,T_B)) extends T_A[(T_A[Byte],T_B)]
case class CC_D(a: T_A[T_A[(Char,Byte)]], b: CC_B, c: T_A[T_B]) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_C, b: Byte, c: CC_B) extends T_B

val v_a: T_A[(T_A[Byte],T_B)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_E(), _) => 1 
  case CC_B(CC_F(_, _, _), _) => 2 
  case CC_C(CC_A(), (CC_B(_, _),CC_D(_, _, _))) => 3 
  case CC_C(CC_A(), (CC_B(_, _),CC_E())) => 4 
  case CC_C(CC_A(), (CC_B(_, _),CC_F(_, _, _))) => 5 
}
}
// This is not matched: CC_B(CC_D(_, CC_B(_, _), _), _)