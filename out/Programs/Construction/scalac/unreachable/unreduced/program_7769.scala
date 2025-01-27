package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte) extends T_A[T_A[T_A[Char, Int], Boolean], Boolean]
case class CC_B(a: T_A[(CC_A,(Byte,Char)), Int], b: CC_A, c: (CC_A,Byte)) extends T_A[T_A[T_A[Char, Int], Boolean], Boolean]
case class CC_C(a: Byte) extends T_A[T_A[T_A[Char, Int], Boolean], Boolean]

val v_a: T_A[T_A[T_A[Char, Int], Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_B(_, CC_A(_), (CC_A(_),0)) => 1 
  case CC_B(_, CC_A(_), (CC_A(_),_)) => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: CC_A(_)