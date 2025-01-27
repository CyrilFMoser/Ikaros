package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: (T_B,T_B), c: Boolean) extends T_A[(T_B,T_A[T_B, T_B]), C]
case class CC_B(a: CC_A[T_A[Byte, Int]], b: (T_B,T_B)) extends T_B
case class CC_C() extends T_B
case class CC_D(a: Boolean, b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, (_,_), _), _) => 0 
  case CC_C() => 1 
  case CC_D(_, CC_B(CC_A(_, _, _), _)) => 2 
}
}