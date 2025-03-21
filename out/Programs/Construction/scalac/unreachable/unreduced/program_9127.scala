package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_B[(Byte,Char)]], c: T_B[T_A]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: T_A) extends T_B[T_B[T_B[CC_B]]]
case class CC_D[B](a: B) extends T_B[T_B[T_B[CC_B]]]
case class CC_E() extends T_B[T_B[T_B[CC_B]]]

val v_a: T_B[T_B[T_B[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_C(CC_A(CC_B(_), _, _)) => 1 
  case CC_C(CC_B(CC_A(_, _, _))) => 2 
  case CC_D(_) => 3 
  case CC_E() => 4 
}
}