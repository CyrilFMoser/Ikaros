package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_B(a: (T_A[T_B],Char)) extends T_A[T_B]
case class CC_C(a: T_A[T_B]) extends T_A[T_B]
case class CC_D(a: CC_B, b: T_A[T_B]) extends T_B
case class CC_E(a: (CC_B,Byte), b: CC_B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((CC_A(_, _),_)) => 1 
  case CC_B((CC_B(_),_)) => 2 
  case CC_B((CC_C(_),_)) => 3 
  case CC_C(CC_A(_, _)) => 4 
  case CC_C(CC_B(_)) => 5 
  case CC_C(CC_C(CC_A(_, _))) => 6 
  case CC_C(CC_C(CC_B(_))) => 7 
}
}
// This is not matched: CC_C(CC_C(CC_C(_)))