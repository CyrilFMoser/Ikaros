package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B(a: (T_A[T_B],T_B), b: (CC_A,T_B)) extends T_A[T_B]
case class CC_C(a: CC_A) extends T_A[T_B]
case class CC_D(a: T_B, b: T_A[Char]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _)) => 0 
  case CC_A(CC_E()) => 1 
  case CC_B((CC_A(_),CC_D(_, _)), (CC_A(_),CC_D(_, _))) => 2 
  case CC_B((CC_A(_),CC_E()), (CC_A(_),CC_D(_, _))) => 3 
  case CC_B((CC_B(_, _),CC_D(_, _)), (CC_A(_),CC_D(_, _))) => 4 
  case CC_B((CC_B(_, _),CC_E()), (CC_A(_),CC_D(_, _))) => 5 
  case CC_B((CC_C(_),CC_D(_, _)), (CC_A(_),CC_D(_, _))) => 6 
  case CC_B((CC_C(_),CC_E()), (CC_A(_),CC_D(_, _))) => 7 
  case CC_B((CC_A(_),CC_D(_, _)), (CC_A(_),CC_E())) => 8 
  case CC_B((CC_A(_),CC_E()), (CC_A(_),CC_E())) => 9 
  case CC_B((CC_B(_, _),CC_D(_, _)), (CC_A(_),CC_E())) => 10 
  case CC_B((CC_B(_, _),CC_E()), (CC_A(_),CC_E())) => 11 
  case CC_B((CC_C(_),CC_D(_, _)), (CC_A(_),CC_E())) => 12 
  case CC_B((CC_C(_),CC_E()), (CC_A(_),CC_E())) => 13 
  case CC_C(CC_A(_)) => 14 
}
}