package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: Char, c: T_B) extends T_A[T_B]
case class CC_B[B]() extends T_B
case class CC_C(a: T_B, b: Boolean, c: CC_A) extends T_B
case class CC_D(a: (Byte,CC_A)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
  case CC_D((0,CC_A(_, _, _))) => 2 
  case CC_D((_,CC_A(_, _, _))) => 3 
}
}