package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[Boolean, CC_A], CC_A], b: (T_A,T_B[CC_A, CC_A])) extends T_A
case class CC_C[C](a: T_A, b: T_B[C, C]) extends T_B[C, Boolean]
case class CC_D[D](a: D, b: D, c: (T_B[CC_B, Boolean],T_B[CC_B, Boolean])) extends T_B[D, Boolean]
case class CC_E[E](a: Boolean, b: E) extends T_B[E, Boolean]

val v_a: CC_D[CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _, (CC_C(_, _),CC_C(_, _))) => 0 
  case CC_D(_, _, (CC_C(_, _),CC_D(_, _, _))) => 1 
  case CC_D(_, _, (CC_C(_, _),CC_E(_, _))) => 2 
  case CC_D(_, _, (CC_D(_, _, _),CC_C(_, _))) => 3 
  case CC_D(_, _, (CC_D(_, _, _),CC_D(_, _, _))) => 4 
  case CC_D(_, _, (CC_D(_, _, _),CC_E(_, _))) => 5 
  case CC_D(_, _, (CC_E(_, _),CC_C(_, _))) => 6 
  case CC_D(_, _, (CC_E(_, _),CC_D(_, _, _))) => 7 
  case CC_D(_, _, (CC_E(_, _),CC_E(_, _))) => 8 
}
}