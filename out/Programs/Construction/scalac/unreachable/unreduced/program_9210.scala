package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Char, c: (T_B,Boolean)) extends T_A[T_A[Char]]
case class CC_B(a: Byte, b: T_A[T_A[Char]], c: T_A[(CC_A,CC_A)]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: Byte, b: T_A[T_A[Char]], c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
  case CC_D(_, _, CC_A(CC_B(_, _, _), _, (_,_))) => 2 
  case CC_D(_, _, CC_A(CC_C(), _, (_,_))) => 3 
  case CC_D(_, _, CC_A(CC_D(_, _, _), _, (_,_))) => 4 
}
}