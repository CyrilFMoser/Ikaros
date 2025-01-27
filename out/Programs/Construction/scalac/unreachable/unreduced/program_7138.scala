package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: Int, c: (T_A[T_B],T_A[Byte])) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C() extends T_B
case class CC_D(a: T_B, b: CC_A, c: CC_C) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, (_,_)), _, _) => 0 
  case CC_A(CC_B(), _, _) => 1 
  case CC_B() => 2 
}
}