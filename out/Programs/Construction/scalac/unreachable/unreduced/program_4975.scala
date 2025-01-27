package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B(a: (T_B,Char), b: CC_A, c: T_A[(T_B,(Char,Boolean))]) extends T_A[T_B]
case class CC_C(a: T_A[T_A[(Boolean,Int)]]) extends T_A[T_B]
case class CC_D(a: T_A[CC_A]) extends T_B
case class CC_E(a: T_A[T_B], b: T_A[T_B]) extends T_B
case class CC_F(a: CC_C) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(_, CC_A(CC_D(_))) => 0 
  case CC_E(_, CC_A(CC_E(_, _))) => 1 
  case CC_E(_, CC_A(CC_F(_))) => 2 
  case CC_E(_, CC_B((_,_), CC_A(_), _)) => 3 
  case CC_E(_, CC_C(_)) => 4 
}
}