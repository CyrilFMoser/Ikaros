package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int, b: T_A[T_B], c: T_B) extends T_A[T_B]
case class CC_B(a: T_B, b: T_A[T_A[Byte]], c: T_A[T_B]) extends T_A[T_B]
case class CC_C() extends T_B
case class CC_D(a: CC_A, b: Byte, c: (T_A[CC_A],Boolean)) extends T_B
case class CC_E(a: CC_A, b: (CC_B,T_A[T_B]), c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, (_,_)) => 1 
  case CC_E(CC_A(_, _, CC_C()), (CC_B(_, _, _),CC_A(_, _, _)), CC_A(_, _, _)) => 2 
  case CC_E(CC_A(_, _, CC_C()), (CC_B(_, _, _),CC_B(_, _, _)), CC_A(_, _, _)) => 3 
  case CC_E(CC_A(_, _, CC_D(_, _, _)), (CC_B(_, _, _),CC_A(_, _, _)), CC_A(_, _, _)) => 4 
  case CC_E(CC_A(_, _, CC_D(_, _, _)), (CC_B(_, _, _),CC_B(_, _, _)), CC_A(_, _, _)) => 5 
  case CC_E(CC_A(_, _, CC_E(_, _, _)), (CC_B(_, _, _),CC_A(_, _, _)), CC_A(_, _, _)) => 6 
  case CC_E(CC_A(_, _, CC_E(_, _, _)), (CC_B(_, _, _),CC_B(_, _, _)), CC_A(_, _, _)) => 7 
}
}