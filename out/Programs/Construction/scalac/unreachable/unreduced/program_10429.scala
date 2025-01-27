package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: (T_A[T_B],T_B)) extends T_A[T_B]
case class CC_B(a: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_A[T_B]) extends T_B
case class CC_D(a: T_A[Int], b: CC_A, c: T_A[T_B]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),CC_C(_))) => 0 
  case CC_A(_, (CC_A(_, _),CC_D(_, _, _))) => 1 
  case CC_A(_, (CC_A(_, _),CC_E())) => 2 
  case CC_A(_, (CC_B(_),CC_C(_))) => 3 
  case CC_A(_, (CC_B(_),CC_D(_, _, _))) => 4 
  case CC_A(_, (CC_B(_),CC_E())) => 5 
  case CC_B(CC_A(CC_D(_, _, _), (_,_))) => 6 
  case CC_B(CC_A(CC_E(), (_,_))) => 7 
  case CC_B(CC_B(CC_A(_, _))) => 8 
  case CC_B(CC_B(CC_B(_))) => 9 
}
}
// This is not matched: CC_B(CC_A(CC_C(_), (_,_)))